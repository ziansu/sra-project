public void setLastDrawablePath(java.lang.String drawablePath) {
    com.ray3k.skincomposer.data.ProjectData.generalPref.putString("last-drawable-path", drawablePath);
    com.ray3k.skincomposer.data.ProjectData.generalPref.flush();
    setLastPath(drawablePath);
}