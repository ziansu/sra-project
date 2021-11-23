public org.springframework.web.servlet.ModelAndView getPageListarAnuncios(java.lang.String path) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    model.addObject("anuncios", anuncioService.getAnuncioRepository().findAll());
    model.setViewName(path);
    return model;
}