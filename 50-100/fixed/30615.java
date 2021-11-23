@java.lang.Override
public java.lang.String evalString(model.ParseTree<java.lang.Double> parent) {
    java.lang.String ret = getParse();
    if ((parent != null) && ((parent.getNode1()) != null)) {
        ret += parent.getNode1().evalString();
    }else {
        ret += "null";
    }
    ret += getParseEnd();
    return ret;
}