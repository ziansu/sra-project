@java.lang.Override
public int compare(java.lang.Integer[] o1, java.lang.Integer[] o2) {
    if ((o1[1]) > (o2[1])) {
        return 1;
    }else
        if ((o1[1]) == (o2[1])) {
            if ((o1[0]) > (o2[0])) {
                return 1;
            }
        }
    
    return -1;
}