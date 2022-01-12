@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteuser", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object deleteUser(int id, javax.servlet.http.HttpServletRequest request) {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    if (userSrv.deleteUser(id)) {
        map.put("success", true);
    }else {
        map.put("success", true);
    }
    return map;
}