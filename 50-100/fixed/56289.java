@java.lang.Override
public void onClick(android.view.View v) {
    if (tinydb.getBoolean("prob2_completed")) {
        problem_number = 3;
        showDialogStartover(3);
    }else {
        int previous_prob_num = (problem_number) - 1;
        android.support.design.widget.Snackbar.make(findViewById(R.id.main_activity_Relative_Layout), (((("Problem " + (problem_number)) + " is locked. Complete problem ") + previous_prob_num) + " first."), Snackbar.LENGTH_LONG).show();
    }
}