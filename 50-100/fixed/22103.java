@java.lang.Override
public int compare(java.util.ArrayList<java.lang.Object> lhs, java.util.ArrayList<java.lang.Object> rhs) {
    double result;
    result = ((double) (rhs.get(1))) - ((double) (lhs.get(1)));
    if (result > 0) {
        return 1;
    }else
        if (result < 0) {
            return -1;
        }
    
    return 0;
}