public boolean existElement(org.shaolin.uimaster.page.ajax.Widget comp) {
    java.lang.String frameName = comp.getFrameInfo();
    if (frameName == null) {
        return false;
    }
    java.util.Map map = getFrameComponentMap(frameName);
    return ((map != null) && (map.containsKey(comp.getId()))) && (comp == (map.get(comp.getId())));
}