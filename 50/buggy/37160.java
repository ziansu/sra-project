private void openSongListFragment(java.lang.String name) {
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment, com.benjaminearley.spotifystreamer.TopSongListFragment.newInstance(name)).addToBackStack(null).commit();
}