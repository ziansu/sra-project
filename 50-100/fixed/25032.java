public java.lang.Long getDownloadDuration() {
    if (((startDownloadTime) == null) || ((startDownloadTime) == 0))
        return null;
    else
        if (((stopDownloadTime) != null) && ((stopDownloadTime) > 0))
            return (stopDownloadTime) - (startDownloadTime);
        else
            return (java.lang.System.currentTimeMillis()) - (startDownloadTime);
        
    
}