@java.lang.Override
public android.view.View getView(int position, android.view.View view, android.view.ViewGroup viewGroup) {
    if (view == null) {
        view = mActivity.getLayoutInflater().inflate(mLayout, viewGroup, false);
    }
    T model = mSnapshots.getItem(position).getValue(mModelClass);
    populateView(view, model, position);
    return view;
}