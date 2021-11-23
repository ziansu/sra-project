@org.springframework.web.bind.annotation.RequestMapping(value = { "/" , "/accounts" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String accounts() {
    return "accountSearch";
}