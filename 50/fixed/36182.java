@org.apache.struts2.convention.annotation.Action(value = "register-submit")
public java.lang.String registerSubmit() {
    registerAndLogin(email, password1);
    return com.gruuf.web.GruufActions.GARAGE;
}