public boolean isConcat(java.lang.String st) {
    int i;
    int j;
    if ((i = st.indexOf("{")) > (-1)) {
        if ((j = st.lastIndexOf("{")) > i) {
            return true;
        }else
            if ((i > 0) || ((j > 0) && (j < ((st.length()) - 1)))) {
                return true;
            }
        
    }
    return false;
}