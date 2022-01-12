private boolean verifyPacket(byte[] request) {
    marshallDemarshall.Deframer deframer = new marshallDemarshall.Deframer();
    object = deframer.deframer(request);
    if ((object) instanceof frames.DownloadRequest) {
        command = "downloadRequest";
        return true;
    }else
        if ((object) instanceof frames.UploadRequest) {
            command = "uploadRequest";
            return true;
        }else
            return false;
        
    
}