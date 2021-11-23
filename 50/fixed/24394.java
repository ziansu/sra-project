@java.lang.Override
public synchronized void add(pl.otros.logview.api.model.LogData... logDatas) {
    proxyLogDataCollector.add(logDatas);
}