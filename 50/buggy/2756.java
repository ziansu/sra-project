@java.lang.Override
public java.lang.String convertResultToString(java.lang.Object resultValue) {
    java.lang.String str = ((((com.nordusk.webservices.ParentId) (resultValue)).getName()) + "-") + (((com.nordusk.webservices.ParentId) (resultValue)).getId());
    return str;
}