public boolean notificar(com.dom.notificacao.model.entity.Notificacao n, com.dom.notificacao.model.dao.entitydao.NotificacaoDAO dao) {
    java.util.Set<javax.validation.ConstraintViolation<java.lang.Object>> obj = new com.dom.notificacao.validator.BeanCheckConstraints(n).validar();
    try {
        com.dom.notificacao.model.helper.ValidationHelper.validarBean(obj, n, dao, "Notificação Incluída.");
    } catch (java.lang.Exception e) {
        com.dom.notificacao.model.helper.ValidationHelper.showException(e, "Ops", n);
        e.printStackTrace();
    }
    return true;
}