private frames.UploadRequest verifyPacket(byte[] request) {
    marshallDemarshall.Deframer deframer = new marshallDemarshall.Deframer();
    object = deframer.deframer(request);
    if ((object) instanceof frames.DownloadRequest) {
        command = "downloadRequest";
        return null;
    }else
        if ((object) instanceof frames.UploadRequest) {
            command = "uploadRequest";
            return ((frames.UploadRequest) (object));
        }else
            return null;
        
    
}