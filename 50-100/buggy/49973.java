@java.lang.Override
public java.util.List<com.bionic.edu.merchant.paylist.PayList> findFilteredUnpaid(int a) {
    java.util.List<com.bionic.edu.merchant.paylist.PayList> list = findUnpaid();
    if (a == 1)
        return list;
    
    if (a == 2)
        java.util.Collections.sort(list);
    else
        if (a == 3) {
            java.util.Collections.sort(list);
            java.util.Collections.reverse(list);
        }
    
    validateByPeriod(list);
    return list;
}