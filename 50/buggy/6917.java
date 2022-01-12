@java.lang.Override
public void run() {
    if (!(isStopped)) {
        org.helioviewer.jhv.data.container.cache.JHVEventCache.getSingletonInstance().add(ev);
    }
}