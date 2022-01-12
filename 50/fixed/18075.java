public static com.utd.radio.fragments.ShowsFragment newInstance(com.utd.radio.fragments.ShowsFragment.Day day) {
    com.utd.radio.fragments.ShowsFragment fragment = new com.utd.radio.fragments.ShowsFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.utd.radio.fragments.ShowsFragment.ARG_DAY, day.ordinal());
    fragment.setArguments(args);
    return fragment;
}