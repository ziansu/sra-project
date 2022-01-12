@org.springframework.web.bind.annotation.RequestMapping(value = "/atualizar_acervo", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String atualizarAcervo(org.springframework.ui.ModelMap modelMap) {
    java.util.List<br.ufc.npi.gal.model.AcervoDocumento> atualizacoesRealizadas = new java.util.ArrayList<br.ufc.npi.gal.model.AcervoDocumento>();
    modelMap.addAttribute("atualizacoesRealizadas", atualizacoesRealizadas);
    modelMap.addAttribute("atualizacaoAcervo", new br.ufc.npi.gal.model.AcervoDocumento());
    return "acervo/atualizar";
}