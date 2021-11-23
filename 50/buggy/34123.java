public void setPhone(java.lang.String phone) {
    if ((max_Char(phone, 30)) && (onlyNumbers(phone))) {
        this.phone = phone;
    }else {
        throw new java.lang.IllegalArgumentException();
    }
}