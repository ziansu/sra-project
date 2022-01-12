@java.lang.Override
public void onRequestFinish(java.lang.Object response) {
    dismissDialog();
    model = ((com.youxing.sogoteacher.model.CourseGoingModel) (response));
    if ((model.getData().getCourse()) == null) {
        isEmpty = true;
    }
    adapter.notifyDataSetChanged();
}