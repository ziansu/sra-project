private void addSubForm(int index) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(activity);
    android.view.ViewGroup container = ((android.widget.LinearLayout) (inflater.inflate(R.layout.form_subform, parent, false)));
    initDeleteBtn(container);
    initFieldList(container, index);
    parent.addView(container, index);
}