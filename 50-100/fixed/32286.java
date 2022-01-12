@java.lang.Override
public void onResume() {
    super.onResume();
    if ((((rustelefonen.no.drikkevett_android.MainActivity) (getActivity())).getCurrentViewpagerPosition()) == 2) {
        ((rustelefonen.no.drikkevett_android.MainActivity) (getActivity())).getFloatingActionMenu().showMenu(true);
    }
    setUserData();
    status = isSessionOver();
    stateHandler(status);
}