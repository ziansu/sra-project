@com.grandet.controller.RequestMapping(value = "/api/user", method = RequestMethod.POST)
@com.grandet.controller.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> addUser(com.grandet.domain.User user) {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    int result = userService.addUser(user);
    if (result == (-1)) {
        map.put("msg", "existed");
    }else
        if (result == 1) {
            map.put("msg", "success");
        }else {
            map.put("msg", "fail");
        }
    
    return map;
}