public com.ths.JDO.Component.PlanningCustomerDeliveryJDO save(com.ths.JDO.Component.PlanningCustomerDeliveryJDO actor) {
    com.ths.DAO.Configuration.PlanningCustomerDeliveryDAO.log.log(java.util.logging.Level.FINER, "Saving example '{0}'");
    ofy.save().entities(actor).now();
    return actor;
}