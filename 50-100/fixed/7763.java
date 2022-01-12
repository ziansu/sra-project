private synchronized boolean isLineAvaliable(int line) {
    org.zhgeaits.zgdanmaku.model.ZGDanmaku danmaku = mLinesAvaliable.get(line);
    if (danmaku == null) {
        return true;
    }
    if ((danmaku.getCurrentOffsetX()) > (danmaku.getDanmakuWidth())) {
        mLinesAvaliable.remove(line);
        return true;
    }
    return false;
}