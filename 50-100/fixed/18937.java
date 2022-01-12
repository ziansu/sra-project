@org.springframework.web.bind.annotation.RequestMapping(value = "/connect", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String Connect(@org.springframework.web.bind.annotation.RequestParam
java.util.Map<java.lang.String, java.lang.String> request) {
    java.lang.String dbName = request.get("dataBase");
    java.lang.String userName = request.get("userName");
    java.lang.String password = request.get("password");
    if (((dbName != null) && (userName != null)) && (password != null)) {
        manager.connect(((manager.getURL()) + dbName), userName, password);
        return "redirect:commands";
    }else {
        return "connect";
    }
}