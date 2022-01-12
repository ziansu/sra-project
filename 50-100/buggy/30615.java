@java.lang.Override
public java.lang.String evalString(model.ParseTree<java.lang.Double> parent) {
    java.lang.String ret = "";
    if ((parent != null) && ((parent.getNode1()) != null)) {
        ret = parent.getNode1().evalString();
        int tmpin = ret.indexOf(getParse());
        if (tmpin != 0) {
            ret = ((getParse()) + ret) + (getParseEnd());
        }
    }else {
        ret += "null";
    }
    return ret;
}