@java.lang.Override
public int compare(vt.trafficnetwork.messaging.helpers.Message m1, vt.trafficnetwork.messaging.helpers.Message m2) {
    if ((m1.getTime()) < (m2.getTime()))
        return -1;
    else
        if ((m1.getTime()) > (m2.getTime()))
            return 1;
        else {
        }
    
    return 0;
}