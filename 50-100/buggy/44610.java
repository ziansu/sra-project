@java.lang.Override
public void onApiResponse(net.ghosttrails.www.mydetic.api.MemoryData memory) {
    if (((progressDialog) != null) && (progressDialog.isShowing())) {
        progressDialog.dismiss();
    }
    if ((memoryData) != null) {
        this.memoryData = memoryData;
        app.setCachedMemory(memoryData);
        hasLoadedMemory = true;
    }
    updateUIFromData();
}