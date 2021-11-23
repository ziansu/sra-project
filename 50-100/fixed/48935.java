@java.lang.Override
public void onResume() {
    super.onResume();
    if (loginController.checkIfLoggedIn()) {
        mSimpleFacebook = com.sromku.simple.fb.SimpleFacebook.getInstance(getActivity());
    }else {
        loginController.logIn();
    }
    if (nl.project.groep4.hhs.bestofdubsmash.view.FavoritesView.refreshNeeded) {
        nl.project.groep4.hhs.bestofdubsmash.view.FavoritesView.refreshNeeded = false;
        nl.project.groep4.hhs.bestofdubsmash.MainActivity activity = ((nl.project.groep4.hhs.bestofdubsmash.MainActivity) (getActivity()));
        activity.displayView(3);
    }
}