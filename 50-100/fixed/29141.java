@java.lang.Override
public int compare(com.openbrew.openbrewrf.CommonBrewSupplies c1, com.openbrew.openbrewrf.CommonBrewSupplies c2) {
    if ((c1.getBoilTime()) < (c2.getBoilTime()))
        return -1;
    else
        if ((c1.getBoilTime()) > (c2.getBoilTime()))
            return 1;
        else
            return 0;
        
    
}