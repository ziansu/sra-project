public void append(java.lang.String str) {
    android.util.Log.d("strbuff", "append");
    if ((mUpdatedBuilder.length()) < (com.example.android.camera2video.MyStringBuffer.mCharCount)) {
        mUpdatedBuilder.append(str);
    }else {
        mBuilderToFile = mUpdatedBuilder;
        mUpdatedBuilder = new java.lang.StringBuffer(com.example.android.camera2video.MyStringBuffer.mCharCount);
        new com.example.android.camera2video.MyStringBuffer.AsyncTaskWriter().execute(mBuilderToFile);
    }
}