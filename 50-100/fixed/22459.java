@java.lang.Override
public int compare(vtea.objects.layercake.microRegion o1, vtea.objects.layercake.microRegion o2) {
    if ((o1.getZPosition()) == (o2.getZPosition())) {
        return 0;
    }else
        if ((o1.getZPosition()) > (o2.getZPosition())) {
            return 1;
        }else
            if ((o1.getZPosition()) < (o2.getZPosition())) {
                return -1;
            }else {
                return 0;
            }
        
    
}