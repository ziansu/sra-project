public boolean check_amb(java.lang.String word, java.lang.String sentence) {
    boolean res = false;
    if (dataModel.GateInterface.false_pos.contains(word)) {
        res = true;
    }
    java.util.Iterator<java.lang.String> it = dataModel.GateInterface.false_pos.iterator();
    while (it.hasNext()) {
        java.lang.String hh = it.next();
        if (sentence.contains(hh)) {
            res = true;
        }
    } 
    if (sentence.contains("Information purposes only")) {
        return true;
    }
    return res;
}