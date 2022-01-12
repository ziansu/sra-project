static void init(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> dataList, java.util.ArrayList<java.lang.Long> time, java.util.ArrayList<java.util.ArrayList<java.lang.Float>> processedDataList) {
    edu.temple.gymminder.DataUtils.processedData = processedDataList;
    edu.temple.gymminder.DataUtils.avgNode = null;
    edu.temple.gymminder.DataUtils.init(dataList, time);
}