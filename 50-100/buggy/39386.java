@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.fragment_fitsy_main, container, false);
    butterknife.ButterKnife.bind(this, rootView);
    exerciseCourseItemList = new java.util.ArrayList<com.example.syoung.fitsy.common.RowItem>();
    com.example.syoung.fitsy.common.MakeDynamicList makeList = new com.example.syoung.fitsy.common.MakeDynamicList(getActivity());
    makeList.execute();
    return rootView;
}