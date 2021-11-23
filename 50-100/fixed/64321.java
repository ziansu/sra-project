@java.lang.Override
public int calcSurfacePreference(boolean pavedSurface) {
    int preference = 0;
    if ((profileManager.prefersPavedSurface()) && (!pavedSurface))
        preference = -2;
    else
        if ((!(profileManager.prefersPavedSurface())) && pavedSurface)
            preference = -2;
        
    
    java.lang.System.out.println(((("PREFERENCE: " + preference) + ", profileManager: ") + (profileManager.prefersPavedSurface())));
    return preference;
}