public void saveLastStart(java.lang.String story, java.lang.String des, java.lang.String creator, java.lang.String[] order) {
    myHelper = new com.projectxi.berlemstudio.contentmanagement.DbHelper(this);
    com.projectxi.berlemstudio.contentmanagement.convertArrays convertor = new com.projectxi.berlemstudio.contentmanagement.convertArrays();
    java.lang.String convert = convertor.convertArrayToString(order);
    myHelper.insertStory("การเล่นครั้งล่าสุด", "เนื้อหาที่ใช้เขาดูครั้งล่าสุด", "Patawat", convert);
    android.util.Log.d("saveStory", "saveLastStart: ");
}