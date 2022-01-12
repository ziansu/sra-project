public boolean externalWebm() {
    if ((Build.VERSION.SDK_INT) < 15)
        return true;
    
    return p.getBoolean(anabolicandroids.chanobol.ui.scaffolding.Prefs.EXTERNAL_WEBM, false);
}