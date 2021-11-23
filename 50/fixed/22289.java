@org.springframework.web.bind.annotation.RequestMapping(value = "/createaccount", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String createAccount(java.util.Map<java.lang.String, java.lang.Object> model) {
    com.barrieault.budgettabs.User user = new com.barrieault.budgettabs.User();
    model.put("addUser", user);
    return "createaccount";
}