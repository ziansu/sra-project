private long getCheckSum(java.util.ArrayList<ruraomsk.list.ru.strongsql.params.SetValue> values) {
    java.util.zip.Checksum checksum = new java.util.zip.CRC32();
    byte[] bytes = sql.getByteArray(values);
    java.lang.System.out.println(java.util.Arrays.toString(bytes));
    java.lang.System.out.println(bytes.length);
    checksum.update(bytes, 0, bytes.length);
    return checksum.getValue();
}