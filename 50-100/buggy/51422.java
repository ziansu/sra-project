public void onClick(android.view.View v) {
    com.hsfl.speakshot.ui.ReadResultFragment fragment = new com.hsfl.speakshot.ui.ReadResultFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putStringArrayList("texts", detectedTexts);
    fragment.setArguments(bundle);
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction ft = fragmentManager.beginTransaction();
    ft.replace(R.id.fragment_container, fragment);
    ft.addToBackStack(null);
    ft.commit();
}