@java.lang.Override
public void setMap(java.lang.String string) {
    if (shared.ContentListHandler.getMapContent().keys().contains(string))
        map = shared.ContentListHandler.getMapContent().getString(string);
    
}