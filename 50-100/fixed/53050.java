private void displayViewP1() {
    setPageId(1);
    htl_leonding.fiplyteam.fiply.user.FCreateUser fragment = new htl_leonding.fiplyteam.fiply.user.FCreateUser();
    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fraUserInput, fragment, "NamePage");
    fragmentTransaction.commit();
}