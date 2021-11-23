@java.lang.Override
public java.lang.String getSimpleName() {
    java.lang.String sName = variableName.substring(((variableName.indexOf("[")) + 1), variableName.length());
    return sName;
}