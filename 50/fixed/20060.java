public boolean userName(java.lang.String fname) {
    if ((fname.length()) > 0) {
        return true;
    }else {
        servlet.addUser.message += "#Enter first name " + "\n";
        java.lang.System.out.println(("#Enter first name " + "\n"));
        return false;
    }
}