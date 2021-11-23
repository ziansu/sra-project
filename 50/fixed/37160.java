private void openSongListFragment(java.lang.String name) {
    getActivity().getSupportFragmentManager().beginTransaction().add(R.id.fragment, com.benjaminearley.spotifystreamer.TopSongListFragment.newInstance(name)).addToBackStack(null).commit();
}