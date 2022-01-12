@java.lang.Override
public int compareTo(FindKPairsWithSmallestSums.SumBundle sb) {
    if ((this.sum) > (sb.sum)) {
        return -1;
    }else
        if ((this.sum) == (sb.sum)) {
            return 0;
        }else {
            return 1;
        }
    
}