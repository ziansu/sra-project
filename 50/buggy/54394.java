@java.lang.Override
public void destroy() {
    org.orienteer.core.OrienteerFilter.LOG.info(("Destroy doOrienteerFilter - " + (this.getClass().getName())));
    org.orienteer.core.boot.loader.OrienteerClassLoader.clear();
    filter.destroy();
    filter = null;
}