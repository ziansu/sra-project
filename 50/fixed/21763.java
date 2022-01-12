@java.lang.Override
public void addDanmaku(master.flame.danmaku.danmaku.model.BaseDanmaku danmaku) {
    super.addDanmaku(danmaku);
    if ((mCacheManager) == null)
        return ;
    
    mCacheManager.addDanmaku(danmaku);
}