private boolean isChildVisible(org.eclipse.jface.action.IContributionItem item) {
    org.eclipse.jface.action.IContributionManagerOverrides overrides = getOverrides();
    if (overrides == null) {
        return item.isVisible();
    }
    java.lang.Boolean v = overrides.getVisible(item);
    return v != null ? v.booleanValue() : item.isVisible();
}