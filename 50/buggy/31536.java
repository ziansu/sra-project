public void execute(UploadUnit.ServerAccessor serverAccessor) {
    try {
        if (serverAccessor == null)
            Blockchain.Transaction.log.info("HEYYYYYYYYYYYYYYYYYOOOOOOOOOOOOOOOOOOOOOOOOO");
        
        serverAccessor.upload(fileName, filePath);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}