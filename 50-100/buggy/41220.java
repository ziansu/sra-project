public java.util.List<group3.MovingBlob> filterUnifiedBlobs(java.util.List<group3.MovingBlob> blobs) {
    java.util.List<group3.MovingBlob> ret = new java.util.LinkedList<>();
    for (group3.MovingBlob blob : blobs) {
        if (!(filterUnifiedBlob(blob)))
            ret.add(blob);
        
    }
    return ret;
}