public void addDanmaku(master.flame.danmaku.danmaku.model.BaseDanmaku item) {
    if ((drawTask) != null) {
        drawTask.addDanmaku(item);
        notifyRendering();
    }
}