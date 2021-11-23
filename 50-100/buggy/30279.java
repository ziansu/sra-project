@java.lang.Override
public void onClick(android.view.View view) {
    student.setPresent(holder.attendance_status.isChecked());
    java.lang.String message = "marked present";
    if (!(holder.attendance_status.isChecked())) {
        message = "marked absent";
        holder.initial.setText("A");
    }else {
        holder.initial.setText("P");
    }
    android.widget.Toast.makeText(view.getContext(), (((holder.name.getText().toString()) + " ") + message), Toast.LENGTH_LONG).show();
}