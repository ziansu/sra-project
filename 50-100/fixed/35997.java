@java.lang.Override
public void onApiResponse(net.ghosttrails.www.mydetic.api.MemoryDataList memories) {
    net.ghosttrails.www.mydetic.api.MemoryDataList appMemories = app.getMemories();
    appMemories.clear();
    try {
        appMemories.mergeFrom(memories);
    } catch (net.ghosttrails.www.mydetic.exceptions.MyDeticException e) {
        net.ghosttrails.www.mydetic.AppUtils.smallToast(getApplicationContext(), e.getMessage());
    }
}