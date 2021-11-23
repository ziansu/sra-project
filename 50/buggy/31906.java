@java.lang.Override
public UserType validate(java.lang.String pass) {
    if (pass == (this.pass)) {
        return utype;
    }else {
        return null;
    }
}