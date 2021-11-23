private boolean isFraud(java.util.ArrayList<Entities.Trade> list) {
    java.util.ArrayList<Entities.Trade> frauds = detection(list);
    if (frauds == null) {
        return false;
    }else
        if ((frauds.size()) < 3) {
            return false;
        }
    
    java.lang.System.out.println("Frad wali Trades");
    java.lang.System.out.println(frauds.size());
    display(frauds);
    return true;
}