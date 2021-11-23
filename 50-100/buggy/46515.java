@java.lang.Override
public java.lang.String getAcccountNumber(java.lang.String delcust) {
    try {
        java.lang.System.out.println("Enter account Number to be Printed in Format->SNGURB-1");
        java.lang.String acno = sc1.nextLine();
        if (acno.startsWith("SNGURB")) {
            return acno;
        }else {
            java.lang.System.out.println("TRY AGAIN:");
            return getAcccountNumber(delcust);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Try again");
        return getAcccountNumber(delcust);
    }
}