@org.springframework.web.bind.annotation.RequestMapping(value = "/getAllTestDescriptions", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<ua.dp.skillsup.tests.dao.entity.TestDescription> getAllTestDescriptions() {
    java.util.List<ua.dp.skillsup.tests.dao.entity.TestDescription> testDescriptions = new java.util.ArrayList<ua.dp.skillsup.tests.dao.entity.TestDescription>();
    testDescriptions.addAll(service.getAllTestDescriptions());
    return testDescriptions;
}