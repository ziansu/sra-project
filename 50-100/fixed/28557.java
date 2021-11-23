@java.lang.Override
public java.lang.String toString() {
    java.lang.String res = "+";
    res += "\n\t" + (getOp1().toString().replaceAll("\n", "\n\t"));
    res += "\n\t" + (getOp2().toString().replaceAll("\n", "\n\t"));
    return res;
}