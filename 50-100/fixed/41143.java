@java.lang.Override
public int compare(java.util.ArrayList<double[]> o1, java.util.ArrayList<double[]> o2) {
    if ((o2.get(0)[0]) > (o1.get(0)[0])) {
        return 1;
    }else
        if ((o2.get(0)[0]) < (o1.get(0)[0])) {
            return -1;
        }else {
            return 0;
        }
    
}