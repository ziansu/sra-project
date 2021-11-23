private void setFieldEnabled(android.view.View view, boolean b, int id) {
    android.widget.TextView element = ((android.widget.TextView) (view.findViewById(id)));
    element.setEnabled(b);
}