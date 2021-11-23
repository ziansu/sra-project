@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/recipe/{id}")
@org.springframework.web.bind.annotation.ResponseBody
public com.ocean.reactservices.model.Recipe getById(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id) {
    return testDao.read(id);
}