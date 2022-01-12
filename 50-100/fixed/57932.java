@java.lang.Override
public int compare(wildtornado.databug.objects.Distance o1, wildtornado.databug.objects.Distance o2) {
    if ((o1.getDistance()) > (o2.getDistance()))
        return -1;
    
    if ((o1.getDistance()) < (o2.getDistance()))
        return 1;
    
    return 0;
}