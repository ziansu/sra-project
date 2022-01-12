@java.lang.Override
public java.lang.String toString() {
    if ((this.size()) == 1) {
        return this.get(0).toString();
    }else {
        java.lang.String str = "(";
        str += this.get(0);
        for (java.lang.Object obj : this.elems) {
            str += ", " + (obj.toString());
        }
        str += ")";
        return str;
    }
}