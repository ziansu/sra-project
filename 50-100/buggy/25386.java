@java.lang.Override
public int compare(com.modelingbrain.home.model.Model o1, com.modelingbrain.home.model.Model o2) {
    if ((o1.getMillisecond_Date()) > (o2.getMillisecond_Date()))
        return 1;
    
    if ((o1.getMillisecond_Date()) < (o2.getMillisecond_Date()))
        return -1;
    
    return 0;
}