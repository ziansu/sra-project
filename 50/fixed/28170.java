public void putRecord(com.perfectoMobile.page.data.PageData pageData) {
    if (pageData != null) {
        java.util.Deque<com.perfectoMobile.page.data.PageData> dataList = recordMap.get(pageData.getType());
        if (dataList instanceof java.util.concurrent.LinkedBlockingDeque)
            dataList.offer(pageData);
        
    }
}