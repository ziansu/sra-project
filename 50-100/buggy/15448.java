@java.lang.Override
public int compare(cn.momia.service.product.sku.Sku s1, cn.momia.service.product.sku.Sku s2) {
    java.util.Date time1 = s1.startTime();
    java.util.Date time2 = s2.startTime();
    if (time1 == null)
        return 1;
    
    if (time2 == null)
        return -1;
    
    long timeStamp1 = time1.getTime();
    long timeStamp2 = time2.getTime();
    if (timeStamp1 <= timeStamp2)
        return 1;
    
    return -1;
}