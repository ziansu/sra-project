@org.apache.felix.scr.annotations.Deactivate
protected void deactivate(org.osgi.service.component.ComponentContext context) {
    log.info(((("in " + (getClass())) + " deactivate with context ") + context));
    this.tcManager = null;
    this.ruleStore = null;
}