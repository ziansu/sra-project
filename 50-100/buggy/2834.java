@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuffer name = new java.lang.StringBuffer();
    for (java.lang.String item : getOrdering()) {
        name.append((item + ", "));
    }
    name.delete(((name.length()) - 2), name.length());
    return name.toString();
}