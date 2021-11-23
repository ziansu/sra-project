@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/critere/")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public java.lang.String criteresToDB(@javax.ws.rs.FormParam(value = "license")
java.lang.String licenseVal, @javax.ws.rs.FormParam(value = "keyword")
java.lang.String keywordVal, @javax.ws.rs.FormParam(value = "periodicity")
int periodicityVal) {
    ensg.tsig.chimn.entities.Criteria myCrit = new ensg.tsig.chimn.entities.Criteria();
    myCrit.setLicense(java.lang.Boolean.valueOf(licenseVal));
    myCrit.setKeyword(keywordVal);
    myCrit.setPeriodicity(java.lang.Integer.valueOf(periodicityVal));
    org.springframework.context.support.ClassPathXmlApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("applicationContext.xml");
    ensg.tsig.chimn.dao.CriteriaDao dao = context.getBean(ensg.tsig.chimn.dao.CriteriaDao.class);
    dao.deleteAll();
    dao.save(myCrit);
    context.close();
    return null;
}