int findPriceRange(long des, double lowPrice, double highPrice) {
    java.util.LinkedList<Record> descList = data.descripMap.get(des);
    int count = 0;
    for (Record record : descList) {
        if (((record.price) <= highPrice) && ((record.price) >= lowPrice))
            count++;
        
    }
    return count;
}