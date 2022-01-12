int findPriceRange(long des, double lowPrice, double highPrice) {
    java.util.LinkedList<Record> descList = data.descripMap.get(des);
    if (descList == null)
        return 0;
    
    int count = 0;
    for (Record record : descList) {
        if (((record.price) <= highPrice) && ((record.price) >= lowPrice))
            count++;
        
    }
    return count;
}