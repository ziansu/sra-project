@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new edu.uw.samueldc.assassin_manager.LobbyFragment().newInstance(edu.uw.samueldc.assassin_manager.MainActivity.userData.get("name"), edu.uw.samueldc.assassin_manager.MainActivity.userData.get("room"));
        case 1 :
            return new edu.uw.samueldc.assassin_manager.MapFragment().newInstance(edu.uw.samueldc.assassin_manager.MainActivity.userData.get("room"));
        case 2 :
            return new edu.uw.samueldc.assassin_manager.MeFragment().newInstance(edu.uw.samueldc.assassin_manager.MainActivity.userData.get("name"), edu.uw.samueldc.assassin_manager.MainActivity.userData.get("room"));
        case 3 :
            return new edu.uw.samueldc.assassin_manager.TargetFragment();
        default :
            return null;
    }
}