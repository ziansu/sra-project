@java.lang.SuppressWarnings(value = "unchecked")
public final <T extends adf.component.module.AbstractModule> T getModule(java.lang.String moduleName) {
    return this.getModule(this.moduleConfig.getValue(moduleName), null);
}