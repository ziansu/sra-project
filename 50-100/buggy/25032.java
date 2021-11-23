public java.lang.Long getDownloadDuration() {
    if ((startDownloadTime) == null)
        return null;
    else
        if ((stopDownloadTime) != null)
            return (stopDownloadTime) - (startDownloadTime);
        else
            return (java.lang.System.currentTimeMillis()) - (startDownloadTime);
        
    
}