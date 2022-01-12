public boolean check_amb(java.lang.String word, java.lang.String sentence) {
    boolean res = true;
    java.util.Iterator<java.lang.String> it = dataModel.GateInterface.false_pos.iterator();
    while (it.hasNext()) {
        java.lang.String hh = it.next();
        if (word.contains(hh)) {
            res = false;
        }
    } 
    if (sentence.contains("Information purposes only")) {
        return false;
    }
    return res;
}