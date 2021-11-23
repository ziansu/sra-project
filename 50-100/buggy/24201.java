@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof jcmp.DocCompare.Pair)) {
        return false;
    }
    try {
        return ((((jcmp.DocCompare.Pair) (o)).i1) == (i1)) && ((((jcmp.DocCompare.Pair) (o)).i2) == (i2));
    } catch (java.lang.Exception e) {
        return false;
    }
}