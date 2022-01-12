@org.springframework.web.bind.annotation.RequestMapping(value = "/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@io.swagger.annotations.ApiOperation(value = "增加用户接口", httpMethod = "POST")
public boolean addUser(@org.springframework.web.bind.annotation.RequestParam
java.lang.String userName) {
    java.util.Map userMap = new java.util.HashMap();
    userMap.put("userName", userName);
    int resultStatus;
    try {
        resultStatus = sqlSessionTemplate.insert("guowang.mapper.InsertUser", userMap);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}