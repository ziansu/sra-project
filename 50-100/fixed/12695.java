private void addFragment(android.support.v4.app.Fragment fragment) {
    android.transition.Transition changeTransform = android.transition.TransitionInflater.from(this).inflateTransition(R.transition.change_image_transform);
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.activity_container, fragment, fragment.getClass().getSimpleName());
    ft.addToBackStack(fragment.getTag());
    ft.commit();
    android.util.Log.d(com.vladscaesteanu.licenta.MainActivity.TAG, ("Fragment no is" + (fragmentManager.getBackStackEntryCount())));
}