public android.view.View getView(int state) {
    android.view.View view = mStateViewArray.get(state);
    if (view == null) {
        throw new java.lang.NullPointerException("view is not inflate");
    }
    return view;
}