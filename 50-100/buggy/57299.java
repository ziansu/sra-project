@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    com.grandilo.financelearn.ui.adapters.PreTestCourseSelectionAdapter.CourseItemHolder courseItemHolder = ((com.grandilo.financelearn.ui.adapters.PreTestCourseSelectionAdapter.CourseItemHolder) (holder));
    java.util.HashMap<java.lang.String, java.lang.String> courseItem = courses.get(position);
    if (courseItem != null) {
        courseItemHolder.bindCourse(context, courseItem, position);
    }
}