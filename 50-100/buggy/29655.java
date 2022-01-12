@org.springframework.transaction.annotation.Transactional
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
@br.com.maiscambio.Autenticacao(value = @br.com.maiscambio.Perfil(value = br.com.maiscambio.Perfil.ESTABELECIMENTO_USUARIO_ESCRITA))
@org.springframework.web.bind.annotation.ResponseBody
public br.com.maiscambio.model.entity.Usuario save(br.com.maiscambio.model.entity.Usuario usuario) {
    validateAndFixForSaving(usuario);
    if ((br.com.maiscambio.model.service.UsuarioService.hasPerfil(getUsuarioService().getFromRequest(getRequest()), Usuario.Perfil.ADMIN)) && ((usuario.getPessoa()) == null)) {
        return getUsuarioService().saveAsInsert(usuario, false);
    }else {
        return getUsuarioService().saveAsInsertByEstabelecimento(usuario, true);
    }
}