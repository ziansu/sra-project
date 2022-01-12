@java.lang.Override
public int compare(org.salesforce.apexdoc.MethodModel o1, org.salesforce.apexdoc.MethodModel o2) {
    java.lang.String methodName1 = o1.getMethodName();
    java.lang.String methodName2 = o2.getMethodName();
    java.lang.String className = getClassName();
    if (methodName1.equals(className)) {
        return java.lang.Integer.MIN_VALUE;
    }else
        if (methodName2.equals(className)) {
            return java.lang.Integer.MAX_VALUE;
        }
    
    return methodName1.toLowerCase().compareTo(methodName2.toLowerCase());
}