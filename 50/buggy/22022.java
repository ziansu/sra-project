public int getResourceID(com.marketo.plugin.Sring resourceName) {
    return activityContext.getResources().getIdentifier(resourceName, "drawable", activityContext.getPackageName());
}