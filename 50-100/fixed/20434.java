@java.lang.Override
public java.lang.Void runOnThread() {
    resultDtoList.clear();
    try {
        resultDtoList.addAll(org.supertite.titeclient.network.RestAccessorWrapper.getAccessor().getService(org.supertite.mediamanagerapi.service.TorrentController.class).searchTorrent(request.getQuery(), request.isUseTpb(), request.isUseEt(), request.isUseKat(), request.isUseYts(), request.isPreferHq()));
    } catch (java.lang.Exception e) {
    }
    return null;
}