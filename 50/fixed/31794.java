public java.lang.Boolean emailAdressAlreadyExist(java.lang.String emailAdress) {
    if ((usr.getEmailAdress(emailAdress)) == null) {
        return false;
    }else {
        return true;
    }
}