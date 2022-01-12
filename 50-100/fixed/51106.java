public void onGetHtmlResponse(java.util.Map<java.lang.String, java.lang.String> inputArgs) {
    java.lang.String fieldId = inputArgs.get("id");
    java.lang.String fieldContents = inputArgs.get("contents");
    if (!(fieldId.isEmpty())) {
        switch (fieldId) {
            case "zss_field_title" :
                mTitle = fieldContents;
                mGetTitleCountDownLatch.countDown();
                break;
            case "zss_field_content" :
                mContentHtml = fieldContents;
                mGetContentCountDownLatch.countDown();
                break;
        }
    }
}