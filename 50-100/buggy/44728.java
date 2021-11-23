private boolean isChildVisible(org.eclipse.jface.action.IContributionItem item) {
    java.lang.Boolean v;
    org.eclipse.jface.action.IContributionManagerOverrides overrides = getOverrides();
    if (overrides == null) {
        v = null;
    }else {
        v = getOverrides().getVisible(item);
    }
    if (v != null) {
        return v.booleanValue();
    }
    return item.isVisible();
}