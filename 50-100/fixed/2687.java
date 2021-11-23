@org.junit.Test
public void testInsertData() {
    java.util.Map<java.lang.String, java.lang.Object> datas = new java.util.HashMap<>();
    datas.put("dd2", "dd2");
    datas.put("weight", 75);
    datas.put("height", 1.75);
    java.lang.System.out.println(writer.insertRecord(datas, source, userKey, empName));
}