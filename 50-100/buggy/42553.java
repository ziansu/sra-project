@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    java.lang.System.out.println("CourseListFragment onCreateView()");
    fragmentView = inflater.inflate(R.layout.course_list, container, false);
    listview = ((no.hials.muldvarp.courses.ListView) (fragmentView.findViewById(R.id.listview)));
    return fragmentView;
}