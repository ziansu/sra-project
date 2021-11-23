private boolean findBackward(java.lang.String str, int index, int offset, int v) {
    edu.luc.nmerge.mvd.navigator.TextNavigator tn = new edu.luc.nmerge.mvd.navigator.TextNavigator(this, index, offset, v);
    int i;
    for (i = (str.length()) - 1; i >= 0; i--) {
        if ((tn.prev()) == (str.charAt(i)))
            offset--;
        else
            break;
        
    }
    return i == (-1);
}