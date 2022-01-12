public java.util.ArrayList<com.guoqiao.basketballrecorder.Beans.RecordBean> getRecords() {
    java.io.File root = createDir();
    java.io.File[] files = root.listFiles();
    java.util.ArrayList<com.guoqiao.basketballrecorder.Beans.RecordBean> recordBeans = new java.util.ArrayList<>();
    for (java.io.File file : files) {
        recordBeans.add(readFileAndSetRecord(file));
    }
    return recordBeans;
}