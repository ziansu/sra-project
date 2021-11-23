@java.lang.Override
public java.lang.String getSimpleName() {
    if (!(variableName.contains("."))) {
        return variableName;
    }else {
        java.lang.String sName = variableName.substring(variableName.lastIndexOf("."), variableName.length());
        return sName;
    }
}