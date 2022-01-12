@org.osgi.service.component.annotations.Modified
public void modified(java.util.Map<java.lang.String, java.lang.Object> map) {
    if (map.containsKey(org.bragi.engine.vlc.VLCEngine.VOLUME))
        setVolume(java.lang.Integer.parseInt(map.get(org.bragi.engine.vlc.VLCEngine.VOLUME).toString()));
    
}