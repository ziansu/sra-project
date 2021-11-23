private java.util.ArrayList<Entities.Trade> isFraud(java.util.ArrayList<Entities.Trade> list) {
    java.util.ArrayList<Entities.Trade> frauds = detection(list);
    if (frauds == null) {
        return null;
    }else
        if ((frauds.size()) < 3) {
            return null;
        }
    
    java.lang.System.out.println("Frad wali Trades");
    java.lang.System.out.println(frauds.size());
    display(frauds);
    return frauds;
}