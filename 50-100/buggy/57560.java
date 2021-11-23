@org.springframework.web.bind.annotation.PutMapping(path = "/createAccount")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.String> createAccount(@org.springframework.web.bind.annotation.RequestParam
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam
java.lang.String email) {
    com.kyepot.bank.model.User user = new com.kyepot.bank.model.User();
    user.setName(name);
    user.setEmail(email);
    java.lang.Long account = accountService.createAccount(user);
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    map.put("accountNumber", account.toString());
    return map;
}