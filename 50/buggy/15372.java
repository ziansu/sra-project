public void removeRangePartial(int startPos, int count) {
    mCompletedBrickInfoList.removeAll(mCompletedBrickInfoList.subList(startPos, (startPos + count)));
    rebuildPositionCache(mCompletedBrickInfoList);
    mAdapter.removeRange(startPos, count);
}