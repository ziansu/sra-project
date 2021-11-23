@java.lang.Override
public int generatePageTotal(int total, int pageSize) {
    if (pageSize > 54) {
        pageSize = 54;
    }
    if (total <= pageSize)
        return 1;
    
    return ((int) (java.lang.Math.ceil((((double) (total)) / (pageSize - 9)))));
}