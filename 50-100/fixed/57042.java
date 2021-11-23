@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    new fga.mds.gpp.trezentos.View.ShowStudentGroupFragment.ServerOperation().execute();
    final android.view.View view = inflater.inflate(R.layout.fragment_show_student_group, container, false);
    progressBar = ((android.widget.ProgressBar) (view.findViewById(R.id.progress_bar_student_group)));
    progressBar.setVisibility(View.VISIBLE);
    return view;
}