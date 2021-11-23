private void newFieldValueSelected(int position, com.example.willpassidomo.androidcomponents.FieldValue newQuestion) {
    com.example.willpassidomo.androidcomponents.FieldValue newQ = out.get(position);
    out.remove(position);
    in.add(in.size(), newQuestion);
}