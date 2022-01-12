public void writeToTable(byte[] rowKey, byte[][] valuesArray) throws java.io.IOException {
    edu.indiana.soic.ts.streaming.storm.utils.Put p = new edu.indiana.soic.ts.streaming.storm.utils.Put(rowKey);
    for (int i = 0; i < (columns.length); i++) {
        p.addColumn(columnFamily, columns[i], valuesArray[i]);
    }
    table.put(p);
    edu.indiana.soic.ts.streaming.storm.utils.HBaseDumper.logger.info(new java.lang.String(rowKey));
}