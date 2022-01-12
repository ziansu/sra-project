public static java.lang.String verifyAddress() {
    UILayer.InputChecker.address = null;
    do {
        java.lang.System.out.println("Please input user's address.");
        UILayer.InputChecker.ok = true;
        UILayer.InputChecker.address = UILayer.Input.readString();
        if ((!(UILayer.InputChecker.address.matches(".*\\d+.*"))) || ((UILayer.InputChecker.address.length()) < 3)) {
            UILayer.InputChecker.ok = false;
            UILayer.ErrorCode.ErrorCode.print(UILayer.WRONG_ADDRESS_INPUT);
        }
    } while (!(UILayer.InputChecker.ok) );
    return UILayer.InputChecker.address;
}