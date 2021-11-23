@javax.validation.constraints.AssertTrue
public boolean isSamePassword(char[] password, char[] passwordConfirm) {
    if (!(java.util.Arrays.equals(password, passwordConfirm))) {
        return false;
    }else {
        return true;
    }
}