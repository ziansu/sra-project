@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = "{";
    for (int i = 0; i < (this.workingArray.length); i++) {
        s += (this.workingArray[i]) + ",";
    }
    s += "}\n";
    return s;
}