java.util.ArrayList<personal.vinay.bigdata.PrepData.Record> setAvgSpread(java.util.ArrayList<personal.vinay.bigdata.PrepData.Record> records) {
    float avgSpread = 0;
    float sumSpread = 0;
    for (personal.vinay.bigdata.PrepData.Record record : records) {
        sumSpread += (record.getBidPrice()) - (record.getAskPrice());
    }
    avgSpread = sumSpread / (records.size());
    for (personal.vinay.bigdata.PrepData.Record record : records) {
        record.setAvgSpread(avgSpread);
    }
    return records;
}