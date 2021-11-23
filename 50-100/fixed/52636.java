@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    java.lang.Float f = com.example.kayle.grade_calculator.Settings.getBaseGrade();
    if (f != (-1)) {
        com.example.kayle.grade_calculator.Assignment a = new com.example.kayle.grade_calculator.Assignment(assignmentName, f);
        a.setGraded(false);
        section.addAssignment(a);
    }else {
        com.example.kayle.grade_calculator.Assignment b = new com.example.kayle.grade_calculator.Assignment(assignmentName, 0.0F, 0.0F, false);
        section.addAssignment(b);
    }
    ela.notifyDataSetChanged();
}