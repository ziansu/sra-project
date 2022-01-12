private edu.uci.eecs.wukong.framework.model.InitValue extractInitValue(int start) {
    short componentId = edu.uci.eecs.wukong.framework.util.WKPFUtil.getLittleEndianShort(buffer, start);
    byte propertyNumber = buffer[(start + 2)];
    propertyNumber++;
    byte size = buffer[(start + 3)];
    byte[] val = new byte[size];
    java.lang.System.arraycopy(buffer, (start + 4), val, 0, size);
    edu.uci.eecs.wukong.framework.model.InitValue value = new edu.uci.eecs.wukong.framework.model.InitValue(componentId, propertyNumber, val);
    return value;
}