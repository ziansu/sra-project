@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if ((this.getClass()) != (obj.getClass())) {
        return false;
    }
    try {
        wyvern.target.corewyvernIL.expression.StringLiteral other = ((wyvern.target.corewyvernIL.expression.StringLiteral) (obj));
        return value.equals(other);
    } catch (java.lang.ClassCastException e) {
        return false;
    }
}