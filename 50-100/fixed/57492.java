@android.support.annotation.Nullable
private info.nightscout.androidaps.interfaces.PluginBase getTheOneEnabledInArray(java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> pluginsInCategory) {
    info.nightscout.androidaps.interfaces.PluginBase found = null;
    for (info.nightscout.androidaps.interfaces.PluginBase p : pluginsInCategory) {
        if ((p.isEnabled()) && (found == null)) {
            found = p;
            continue;
        }else
            if (p.isEnabled()) {
                p.setFragmentEnabled(false);
            }
        
    }
    if ((found == null) && ((pluginsInCategory.size()) > 0))
        found = pluginsInCategory.get(0);
    
    return found;
}