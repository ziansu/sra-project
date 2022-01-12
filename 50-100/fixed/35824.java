@java.lang.Override
@org.springframework.web.bind.annotation.RequestMapping(path = "Queries/PersonalInformation", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public infoeval.main.mysql.TableEntry getPersonal_Information(java.lang.String name) throws java.lang.Exception {
    infoeval.main.services.InfoevalServiceImp.logger.log(java.util.logging.Level.INFO, (("Get personal information was called.\n Parameters:" + "Name:") + name));
    name = name.trim().replaceAll(" ", "_");
    return new infoeval.main.mysql.SqlRunner().getPersonalInfo(name);
}