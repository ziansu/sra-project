public boolean dependsOn(org.zaproxy.zap.control.AddOn addOn) {
    if (((dependencies) == null) || (dependencies.getAddOns().isEmpty())) {
        return false;
    }
    dependsOn(dependencies.getAddOns(), addOn);
    return false;
}