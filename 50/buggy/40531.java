public void saveItem(com.pihen.d3restapi.beans.Item item) {
    try {
        recorder.saveItem(item);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}