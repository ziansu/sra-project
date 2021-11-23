@java.lang.Override
public int compareTo(com.qkninja.network.handler.DistanceHandler object) {
    if ((object.distance) > (this.distance))
        return 1;
    else
        if ((object.distance) == (this.distance))
            return 0;
        else
            return -1;
        
    
}