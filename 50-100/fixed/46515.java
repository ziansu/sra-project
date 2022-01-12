@java.lang.Override
public java.lang.String getAcccountNumber() {
    try {
        java.lang.System.out.println("Enter account Number to be Printed in Format->SNGURB-1");
        java.lang.String acno = sc1.nextLine();
        if (acno.startsWith("SNGURB")) {
            return acno;
        }else {
            java.lang.System.out.println("TRY AGAIN:");
            return getAcccountNumber();
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Try again");
        return getAcccountNumber();
    }
}