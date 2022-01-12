@java.lang.Override
public void union(int pId, int qId) {
    int pRootId = root(pId);
    int qRootId = root(qId);
    if (pRootId == qRootId) {
        return ;
    }
    if (isFirstRootLighter(pRootId, qRootId)) {
        parentIds[pRootId] = qRootId;
        size[qRootId] += size[pRootId];
    }else {
        parentIds[pRootId] = qRootId;
        size[pRootId] += size[qRootId];
    }
}