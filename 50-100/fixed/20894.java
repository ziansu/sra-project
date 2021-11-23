@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    if (!hasFocus) {
        return ;
    }
    java.lang.String dec = cs.com.bincalc.AppContext.getValue(AppContext.KEY_DEC_VALUE, true);
    if ((dec != null) && (!(dec.equals("")))) {
        setAllValue(java.lang.Long.parseLong(dec));
    }
}