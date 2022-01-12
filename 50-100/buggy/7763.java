private synchronized boolean isLineAvaliable(int line) {
    org.zhgeaits.zgdanmaku.model.ZGDanmaku danmaku = mLinesAvaliable.get(line);
    if (danmaku == null) {
        return true;
    }
    if ((danmaku.getCurrentOffsetX()) > (danmaku.getDanmakuWidth())) {
        return true;
    }
    return false;
}