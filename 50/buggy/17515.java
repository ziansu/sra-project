public int getResourceId(java.lang.String layoutFile) {
    int resourceId = 0;
    resourceId = getResources().getIdentifier(layoutFile, "xml", getPackageName());
    return resourceId;
}