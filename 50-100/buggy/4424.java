private void getEvery10Char(java.lang.String content, android.util.SparseArray<com.companyname.assignment.models.CharAtPosition> chars, int shift) {
    int index = shift - 1;
    if (((content == null) || (index >= (content.length()))) || (index < 0)) {
        return ;
    }else {
        chars.put(shift, new com.companyname.assignment.models.CharAtPosition(content.charAt(index), index));
        getEvery10Char(content, chars, (shift + (mShift)));
    }
}