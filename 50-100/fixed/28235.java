private void loadMoodshotFormatterFragment(android.net.Uri selectedImage) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("selectedImage", selectedImage.toString());
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
    moodShotFormatterFragment = com.example.srravela.koolo.moods.fragments.KooloMoodShotFormatterFragment.newInstance();
    moodShotFormatterFragment.setArguments(bundle);
    transaction.replace(R.id.fragment_moods_container, moodShotFormatterFragment, "moodmapfragment");
    transaction.addToBackStack("MoodShotFormatterFragment");
    transaction.commitAllowingStateLoss();
}