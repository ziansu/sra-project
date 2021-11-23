@javax.annotation.CheckReturnValue
@javax.annotation.CheckForNull
public static java.lang.String normalizeUserName(@javax.annotation.CheckForNull
java.lang.String inputName) throws jmri.NamedBean.BadUserNameException {
    java.lang.String result = inputName;
    if (null != inputName) {
        result = result.trim();
    }
    return result;
}