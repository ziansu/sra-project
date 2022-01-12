@java.lang.Override
public java.lang.String normalize(java.lang.String dom) {
    java.lang.String strippedDom = dom;
    for (java.lang.String attribute : ignoreAttributes) {
        java.lang.String regExp = ("\\s" + attribute) + "=\"[^\"]*\"";
        strippedDom = strippedDom.replaceAll(regExp, "");
    }
    return strippedDom;
}