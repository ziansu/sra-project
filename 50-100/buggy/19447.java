@java.lang.Override
public java.util.Map<java.lang.String, com.hust.bill.electric.bean.RemainRecord> getLastRemainsByBuilding(java.lang.String buildingName) {
    com.hust.bill.electric.bean.RemainRecord[] remainRecords = consumeDAO.getLastRemainsByBuilding();
    java.util.Map<java.lang.String, com.hust.bill.electric.bean.RemainRecord> map = new java.util.HashMap<java.lang.String, com.hust.bill.electric.bean.RemainRecord>(remainRecords.length);
    for (com.hust.bill.electric.bean.RemainRecord remainRecord : remainRecords) {
        map.put(remainRecord.getRoomName(), remainRecord);
    }
    return map;
}