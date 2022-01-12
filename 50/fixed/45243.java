@java.lang.Override
public void bindAdapter() {
    courseTableModel = new cn.edu.jxnu.awesome_campus.model.home.CourseTableModel();
    courseInfoModel = new cn.edu.jxnu.awesome_campus.model.home.CourseInfoModel();
    adapter = new cn.edu.jxnu.awesome_campus.support.adapter.home.CourseTableAdapter(getActivity(), courseTableModel);
    recyclerView.setAdapter(adapter);
}