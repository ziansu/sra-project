@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    getActivity().setTitle("Test your Skills");
    ((com.interviewquestion.activity.HomeActivity) (getActivity())).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    return inflater.inflate(R.layout.fragment_home, container, false);
}