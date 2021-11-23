public void setSecondaryFragment(com.example.kemos.fainalmoviemalapp.Controller.ISecondaryFragment secondaryFragment) {
    this.secondaryFragment = secondaryFragment;
    if (secondaryFragment != null) {
        secondaryFragment.setMovieItem(movieItemArray.get(0));
        getActivity().setTitle(((((movieItemArray.get(0).getTitle()) + " (") + (movieItemArray.get(0).getDate().substring(0, 4))) + ")"));
    }
}