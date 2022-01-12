@java.lang.Override
public java.lang.String toString() {
    java.lang.String res = "+";
    res += "\n\t" + (treelang.TStorage.gI().get(getOp1()).toString().replaceAll("\n", "\n\t"));
    res += "\n\t" + (treelang.TStorage.gI().get(getOp2()).toString().replaceAll("\n", "\n\t"));
    return res;
}