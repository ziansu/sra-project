public nl.hnogames.domoticz.Utils.ServerUtil getServerUtil() {
    android.app.Activity activity = getActivity();
    if (activity instanceof nl.hnogames.domoticz.MainActivity) {
        return ((nl.hnogames.domoticz.MainActivity) (getActivity())).geServerUtil();
    }else
        if (activity instanceof nl.hnogames.domoticz.PlanActivity) {
            return ((nl.hnogames.domoticz.PlanActivity) (getActivity())).getServerUtil();
        }else
            return null;
        
    
}