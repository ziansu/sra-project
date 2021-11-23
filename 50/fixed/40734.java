public boolean dependsOn(org.zaproxy.zap.control.AddOn addOn) {
    if (((dependencies) == null) || (dependencies.getAddOns().isEmpty())) {
        return false;
    }
    return dependsOn(dependencies.getAddOns(), addOn);
}