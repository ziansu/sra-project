@java.lang.Override
public void setMap(java.lang.String string) {
    java.lang.System.out.println(string);
    if (shared.ContentListHandler.getMapContent().keys().contains(string))
        map = shared.ContentListHandler.getModeMaps().getString(string);
    
    java.lang.System.out.println(map);
}