public java.lang.String getMethodName() {
    java.lang.String nameLine = getNameLine().trim();
    if ((nameLine != null) && ((nameLine.length()) > 0)) {
        int lastindex = nameLine.indexOf("(");
        if (lastindex >= 0) {
            java.lang.String methodName = org.salesforce.apexdoc.ApexDoc.strPrevWord(nameLine, lastindex);
            methodName = (methodName != null) ? methodName : "";
            return methodName;
        }
    }
    return "";
}