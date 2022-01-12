private void GetTTH(java.lang.String Filename) throws java.io.IOException {
    this.Filename = Filename;
    try {
        OpenFile();
        if (Initialize()) {
            SplitFile();
            StartThreads();
            CompressTree();
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("error while trying to get TTH: " + (e.getMessage())));
        StopThreads();
    }
    if ((FilePtr) != null)
        FilePtr.close();
    
}