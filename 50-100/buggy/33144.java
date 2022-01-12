@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@br.com.maiscambio.Autenticacao(value = @br.com.maiscambio.Perfil(value = br.com.maiscambio.Perfil.ESTABELECIMENTO_DASHBOARD_LEITURA))
public br.com.maiscambio.util.View index(@org.springframework.web.bind.annotation.RequestParam
java.lang.String selectedFormattedDate) {
    br.com.maiscambio.model.entity.Usuario usuario = getUsuarioService().getFromRequest(getRequest());
    br.com.maiscambio.util.View view = view("full", "dashboard", "Dashboard");
    if (br.com.maiscambio.model.service.UsuarioService.hasPerfil(usuario, Usuario.Perfil.ADMIN)) {
        view.addObject("estabelecimentos", getEstabelecimentoService().findByUsuarioStatusWherePaiIsNullAndUsuariosSizeIsOne(Usuario.Status.INATIVO));
    }else {
        view.addObject("moedas", getTaxaService().getMoedasAsStringList());
    }
    return view;
}