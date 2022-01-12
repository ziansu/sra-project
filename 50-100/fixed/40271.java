@java.lang.Override
public int compareTo(org.kryptonmlt.networkdemonstrator.pojos.NodeDistance o) {
    if ((this.getDistance()) < (o.getDistance())) {
        return -1;
    }else
        if ((this.getDistance()) > (o.getDistance())) {
            return 1;
        }
    
    return 0;
}