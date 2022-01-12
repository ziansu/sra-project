@java.lang.Override
public java.lang.String toString() {
    java.lang.String str = "Symbol Table list:";
    for (int i = nestinglevel; (-1) < (nestinglevel); i++) {
        str += ("Nesting level " + i) + ":\n";
        str += tables[i].toString();
    }
    return str;
}