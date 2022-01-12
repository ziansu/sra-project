public org.exist.xquery.functions.array.Sequence tail() throws org.exist.xquery.functions.array.XPathException {
    if ((vector.length()) == 2) {
        final org.exist.xquery.functions.array.Sequence tail = vector.nth(1);
        return (tail.getItemType()) == (Type.ARRAY) ? tail : new org.exist.xquery.functions.array.ArrayType(context, tail);
    }
    return new org.exist.xquery.functions.array.ArrayType(context, org.exist.xquery.functions.array.RT.subvec(vector, 1, vector.length()));
}