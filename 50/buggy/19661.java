@java.lang.Override
protected void dataProviderChanged(org.confetti.core.DataProvider oldDp, org.confetti.core.DataProvider newDp) {
    org.confetti.rcp.views.InstituteView.Root.All.setProvider(newDp);
}