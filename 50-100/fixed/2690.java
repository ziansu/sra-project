@java.lang.Override
public java.lang.String toString() {
    if ((this.size()) == 1) {
        return this.get(0).toString();
    }else {
        java.lang.String str = "(";
        str += this.get(0);
        for (int i = 1; i < (this.size()); ++i) {
            str += ", " + (this.get(i).toString());
        }
        str += ")";
        return str;
    }
}