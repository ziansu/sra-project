@java.lang.Override
public void onDeleteRequested(java.lang.String user) {
    java.util.ArrayList<adnan.haber.Haber.HaberListener> corpses = new java.util.ArrayList<>();
    for (adnan.haber.Haber.HaberListener listener : adnan.haber.HaberService.getHaberListeners()) {
        if (listener == null)
            corpses.add(null);
        else
            listener.onDeleteRequested(user);
        
    }
    for (adnan.haber.Haber.HaberListener listener : corpses)
        adnan.haber.HaberService.removeHaberListener(listener);
    
}