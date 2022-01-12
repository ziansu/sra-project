public se.meer.jpa.service.UserService getUserService() {
    context.scan("se.meer.jpa.config");
    context.refresh();
    se.meer.jpa.service.UserService service = context.getBean(se.meer.jpa.service.UserService.class);
    return service;
}