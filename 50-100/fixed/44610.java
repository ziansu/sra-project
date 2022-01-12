@java.lang.Override
public void onApiResponse(net.ghosttrails.www.mydetic.api.MemoryData memory) {
    if (((progressDialog) != null) && (progressDialog.isShowing())) {
        progressDialog.dismiss();
    }
    if (memory != null) {
        this.memoryData = memory;
        app.setCachedMemory(memory);
        hasLoadedMemory = true;
    }
    updateUIFromData();
}