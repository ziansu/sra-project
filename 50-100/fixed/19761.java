@de.jgehrmann.main.authenticate.RequestMapping(path = "/authenticate", method = RequestMethod.GET)
public java.lang.String authenticate(@de.jgehrmann.main.authenticate.RequestHeader(value = "authentication")
java.lang.String authentication) {
    if ((!(authentication.isEmpty())) && (!(authentication.equals("")))) {
        java.lang.String[] creadentials = authentication.split(":");
        java.lang.String username = creadentials[0];
        java.lang.String passphrase = creadentials[1];
        return new java.lang.String(((("You tried to authenticate using the following header: \nHeadername: authentication\nusername: " + username) + "\npassphrase: ") + passphrase));
    }else {
        return "Please specify a authentication header to test your basic auth mechanism.";
    }
}