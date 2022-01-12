@java.lang.Override
public void init(edu.uci.ics.hyracks.storage.am.common.api.ITreeIndexMetaDataFrame metaFrame) throws edu.uci.ics.hyracks.api.exceptions.HyracksDataException {
    if ((confiscatedMetaNode) != null) {
        return ;
    }
    edu.uci.ics.hyracks.storage.common.buffercache.ICachedPage metaNode = bufferCache.confiscatePage(BufferCache.INVALID_DPID);
    metaNode.acquireWriteLatch();
    try {
        metaFrame.setPage(metaNode);
        metaFrame.initBuffer(edu.uci.ics.hyracks.storage.am.common.freepage.LinkedMetaDataPageManager.META_PAGE_LEVEL_INDICATOR);
        metaFrame.setMaxPage(0);
    } finally {
        metaNode.releaseWriteLatch(false);
        confiscatedMetaNode = metaNode;
        appendOnly = true;
    }
}