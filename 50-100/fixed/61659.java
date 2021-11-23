java.util.ArrayList<personal.vinay.bigdata.PrepData.Record> setMaxSpread(java.util.ArrayList<personal.vinay.bigdata.PrepData.Record> records) {
    double maxSpread = 0;
    for (personal.vinay.bigdata.PrepData.Record record : records) {
        if (((record.getBidPrice()) - (record.getAskPrice())) > maxSpread) {
            maxSpread = (record.getBidPrice()) - (record.getAskPrice());
        }
    }
    for (personal.vinay.bigdata.PrepData.Record record : records) {
        record.setMaxSpread(maxSpread);
    }
    return records;
}