@java.lang.Override
public void onClick(android.view.View v) {
    checkbox1.setVisibility(View.VISIBLE);
    c1 = 1;
    if (checkbox1.isChecked()) {
        cal = "true";
        app.com.digitallearning.TeacherModule.Classes.EditClassFragment.textcal = "Calender";
    }else
        if (!(checkbox1.isChecked())) {
            cal = "\" \" ";
        }
    
}