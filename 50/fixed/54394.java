@java.lang.Override
public void destroy() {
    org.orienteer.core.OrienteerFilter.LOG.info(("Destroy doOrienteerFilter - " + (this.getClass().getName())));
    filter.destroy();
    filter = null;
}