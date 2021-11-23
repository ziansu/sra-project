@java.lang.Override
public int compare(no.imr.nmdapi.generic.nmdechosounder.domain.luf20.AcocatType o1, no.imr.nmdapi.generic.nmdechosounder.domain.luf20.AcocatType o2) {
    if ((o1.getAcocat().intValue()) > (o2.getAcocat().intValue())) {
        return 1;
    }else
        if ((o1.getAcocat().intValue()) > (o2.getAcocat().intValue())) {
            return -1;
        }
    
    return 0;
}