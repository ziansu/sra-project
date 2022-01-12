@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    batteryOptimizePref.setChecked(true);
    if (pref.getBoolean("workMode", true)) {
        getActivity().startService(new android.content.Intent(getActivity(), com.nikhilparanjape.radiocontrol.services.PersistenceService.class));
    }else {
        registerForBroadcasts(c);
    }
}