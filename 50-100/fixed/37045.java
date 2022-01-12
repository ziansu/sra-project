@java.lang.Override
void setValueInView(java.lang.Object o, android.view.View view) {
    android.widget.EditText widthView = ((android.widget.EditText) (view.findViewById(R.id.widthEditText)));
    android.widget.EditText heightView = ((android.widget.EditText) (view.findViewById(R.id.heightEditText)));
    int[] size = ((int[]) (o));
    widthView.setText(java.lang.Integer.toString(size[0]));
    heightView.setText(java.lang.Integer.toString(size[1]));
}