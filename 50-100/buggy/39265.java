@java.lang.Override
public void onRequestFinish(java.lang.Object response) {
    dismissDialog();
    model = ((com.youxing.sogoteacher.model.CourseGoingModel) (response));
    if ((model.getData().getCourse()) == null) {
        showEmptyView("课程还没有开始哦～");
    }else {
        adapter.notifyDataSetChanged();
    }
}