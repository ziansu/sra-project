public static java.util.ArrayList<com.guoqiao.basketballrecorder.Beans.RecordBean> getRecords() {
    java.io.File root = com.guoqiao.basketballrecorder.Utils.FileUtil.createDir("Records");
    java.io.File[] files = root.listFiles();
    java.util.ArrayList<com.guoqiao.basketballrecorder.Beans.RecordBean> recordBeans = new java.util.ArrayList<>();
    for (java.io.File file : files) {
        recordBeans.add(com.guoqiao.basketballrecorder.Utils.FileUtil.readFileAndSetRecord(file));
    }
    return recordBeans;
}