@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPage = getArguments().getInt(com.example.vikramjeet.challengerapp.fragments.OpenChallengesFragment.ARG_PAGE);
    challenges = new java.util.ArrayList<>();
    aOpenChallenges = new com.example.vikramjeet.challengerapp.adapters.ChallengeArrayAdapter(getActivity(), challenges, this);
    populateData();
}