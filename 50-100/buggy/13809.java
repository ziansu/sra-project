@java.lang.Override
public java.lang.String toString() {
    java.lang.String declaringClass;
    java.lang.String ret = (name) + ": [";
    for (java.lang.String method : methodList) {
        declaringClass = this.methodDeclatingMap.get(method);
        ret += ((("_" + declaringClass) + "_") + method) + ",";
    }
    ret = ret.substring(0, ((ret.length()) - 1));
    ret += "]\n";
    return ret;
}