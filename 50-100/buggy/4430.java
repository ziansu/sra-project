@org.springframework.web.bind.annotation.RequestMapping(value = "/add", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json", produces = "application/json")
@io.swagger.annotations.ApiOperation(value = "增加用户接口", httpMethod = "POST")
public boolean addUser(@org.springframework.web.bind.annotation.RequestParam
java.lang.String userName) {
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    java.lang.Long currentTimeMillis = java.lang.System.currentTimeMillis();
    java.util.Map userMap = new java.util.HashMap();
    userMap.put("userName", userName);
    userMap.put("createTime", dateFormat.format(currentTimeMillis));
    int resultStatus;
    try {
        resultStatus = sqlSessionTemplate.insert("guowang.mapper.InsertUser", userMap);
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}