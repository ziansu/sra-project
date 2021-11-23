public tw.jwzhuang.jtools.HandlerWatcher makeHandler(tw.jwzhuang.jtools.HandlerTask task, int secs) {
    return makeWatcher().runTask(task, (secs * 1000));
}