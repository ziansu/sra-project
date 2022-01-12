@java.lang.Override
public void afterPropertiesSet() {
    super.afterPropertiesSet();
    if ((this.auditorAware) != null) {
        this.setAuditorAware(this.auditorAware);
    }
}