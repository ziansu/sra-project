@org.springframework.web.bind.annotation.PutMapping(path = "/createAccount")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.String> createAccount(@org.springframework.web.bind.annotation.RequestBody
com.kyepot.bank.model.User user) {
    java.lang.Long account = accountService.createAccount(user);
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    map.put("accountNumber", account.toString());
    return map;
}