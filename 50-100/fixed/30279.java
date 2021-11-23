@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String message = "marked present";
    if (!(holder.attendance_status.isChecked())) {
        message = "marked absent";
        holder.initial.setText("A");
        student.setPresent(false);
    }else {
        holder.initial.setText("P");
        student.setPresent(true);
    }
    android.widget.Toast.makeText(view.getContext(), (((holder.name.getText().toString()) + " ") + message), Toast.LENGTH_LONG).show();
}