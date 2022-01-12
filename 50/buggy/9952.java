@java.lang.Override
public java.lang.String toString() {
    return (table) + (suneido.util.Util.nil(idx) ? "" : "^" + (suneido.util.Util.listToParens(idx)));
}