private boolean findForward(java.lang.String str, int index, int offset, int v) {
    edu.luc.nmerge.mvd.navigator.TextNavigator tn = new edu.luc.nmerge.mvd.navigator.TextNavigator(this, index, offset, v);
    int i;
    for (i = 0; i < (str.length()); i++) {
        if ((tn.next()) == (str.charAt(i)))
            offset++;
        else
            break;
        
    }
    return i == (str.length());
}