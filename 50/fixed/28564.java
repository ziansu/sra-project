@java.lang.Override
public ro.pippo.core.WebServer setPippoFilter(ro.pippo.core.PippoFilter pippoFilter) {
    this.application = pippoFilter.getApplication();
    return this;
}