@java.lang.Override
public void run() {
    android.support.v4.app.Fragment fragment = miage.projetindustriel.fragment.MusicPlayerFragment.newInstance(listMusique, positionMusicSelected);
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
    fragmentTransaction.replace(R.id.fragment_container, fragment, "MusicPlayer");
    fragmentTransaction.commitAllowingStateLoss();
    fragmentTransaction.addToBackStack(null);
}