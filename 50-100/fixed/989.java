private void fragmentLoad(android.support.v4.app.Fragment newFragment, com.example.bbschool.bbremotemobile.Mode mode) {
    if (newFragment == null)
        return ;
    
    this.mode = mode;
    getSupportActionBar().setTitle(com.example.bbschool.bbremotemobile.InputActivity.fragmentTags.get(mode));
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.input_mode_fragment, newFragment, com.example.bbschool.bbremotemobile.InputActivity.fragmentTags.get(mode));
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}