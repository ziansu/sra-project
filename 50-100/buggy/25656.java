@java.lang.Override
public void onResume() {
    super.onResume();
    if (loginController.checkIfLoggedIn()) {
        mSimpleFacebook = com.sromku.simple.fb.SimpleFacebook.getInstance(getActivity());
    }else {
        loginController.logIn();
    }
    if (nl.project.groep4.hhs.bestofdubsmash.view.MainView.refreshNeeded) {
        nl.project.groep4.hhs.bestofdubsmash.view.MainView.refreshNeeded = false;
        nl.project.groep4.hhs.bestofdubsmash.MainActivity activity = ((nl.project.groep4.hhs.bestofdubsmash.MainActivity) (getActivity()));
        activity.displayView(1);
        activity.finish();
    }
}