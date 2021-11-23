public void setLastPath(java.lang.String lastPath) {
    preferences.put("last-path", lastPath);
    com.ray3k.skincomposer.data.ProjectData.generalPref.putString("last-path", lastPath);
    com.ray3k.skincomposer.data.ProjectData.generalPref.flush();
}