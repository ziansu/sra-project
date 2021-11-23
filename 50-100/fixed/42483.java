@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = "{";
    for (int i = 0; i < (workingArray.length); i++) {
        s += (workingArray[i]) + ",";
    }
    s += "}\n";
    return s;
}