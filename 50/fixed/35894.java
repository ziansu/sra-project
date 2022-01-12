public void setLocOption(com.baidu.location.LocationClientOption option) {
    if ((mClient) == null)
        android.util.Log.e(getClass().getName(), "locationclient can not be null before using is");
    else
        mClient.setLocOption(option);
    
}