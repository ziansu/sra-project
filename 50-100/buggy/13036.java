java.util.ArrayList<personal.vinay.bigdata.PrepData.Record> setMinSpread(java.util.ArrayList<personal.vinay.bigdata.PrepData.Record> records) {
    float minSpread = 9999;
    for (personal.vinay.bigdata.PrepData.Record record : records) {
        if (((record.getBidPrice()) - (record.getAskPrice())) < minSpread) {
            minSpread = (record.getBidPrice()) - (record.getAskPrice());
        }
    }
    for (personal.vinay.bigdata.PrepData.Record record : records) {
        record.setMinSpread(minSpread);
    }
    return records;
}