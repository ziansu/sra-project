private void showNameInput(int mScore) {
    getFragmentManager().beginTransaction().setCustomAnimations(R.animator.enter_from_bottom, R.animator.exit_to_top).replace(R.id.overlay_fragment_container, com.example.colormemory.fragments.NameInputFragment.newInstance(mScore, this), com.example.colormemory.MainActivity.TAG_NAMEINPUTFRAGMENT).commit();
}