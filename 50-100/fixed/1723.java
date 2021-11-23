private void launchWordGenerationFragment() {
    if ((null == (getSupportFragmentManager().findFragmentByTag(getString(R.string.generation_fragment_tag)))) || (!(getSupportFragmentManager().findFragmentByTag(getString(R.string.generation_fragment_tag)).isVisible()))) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_content_frame, new com.conz13.d.strongpasswordcreator.WordGenerationFragment(), getString(R.string.generation_fragment_tag)).addToBackStack(null).commit();
    }
}