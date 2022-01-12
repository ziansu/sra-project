@javax.validation.constraints.AssertTrue
public boolean isSamePassword(java.lang.String password, java.lang.String passwordConfirm) {
    if (!(password.equals(passwordConfirm))) {
        return false;
    }else {
        return true;
    }
}