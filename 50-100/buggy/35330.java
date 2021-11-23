@java.lang.Override
public void onBackStackChanged() {
    try {
        int entrys = getSupportFragmentManager().getBackStackEntryCount();
        java.lang.String fragmentName = getSupportFragmentManager().getBackStackEntryAt((entrys - 1)).getName();
        com.brainSocket.aswaq.enums.FragmentType backFrag = com.brainSocket.aswaq.enums.FragmentType.valueOf(fragmentName);
        if (entrys > 1) {
            updateActionbar(backFrag);
        }else {
            updateActionbar(FragmentType.Main);
        }
    } catch (java.lang.Exception e) {
    }
}