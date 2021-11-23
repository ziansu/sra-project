private void getEvery10Char(java.lang.String content, android.util.SparseArray<com.companyname.assignment.models.CharAtPosition> chars, int shift) {
    int index = shift - 1;
    if ((content == null) || (index < 0)) {
        return ;
    }
    while (index < (content.length())) {
        chars.put((index + 1), new com.companyname.assignment.models.CharAtPosition(content.charAt(index), index));
        index += mShift;
    } 
}