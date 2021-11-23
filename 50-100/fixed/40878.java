@java.lang.Override
public void onApiResponse(net.ghosttrails.www.mydetic.api.MemoryDataList newMemories) {
    try {
        getMemories().mergeFrom(newMemories);
    } catch (net.ghosttrails.www.mydetic.exceptions.MyDeticException e) {
        net.ghosttrails.www.mydetic.AppUtils.smallToast(context, e.getMessage());
    }
    externalListener.onApiResponse(getMemories());
}