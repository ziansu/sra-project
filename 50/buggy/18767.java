@java.lang.Override
public java.lang.Double eval(model.ParseTree<java.lang.Double> parent) {
    java.lang.Double ret = 0.0;
    if (parent != null) {
        ret = model.TheMath.And(parent.getNodeVal1(0.0), parent.getNodeVal2(1.0));
    }
    return ret;
}