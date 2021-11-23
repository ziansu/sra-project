@java.lang.Override
public void onClick(android.view.View v) {
    if ((step) == 2) {
        attempBack();
    }else {
        finish();
    }
    overridePendingTransition(R.anim.activity_in_from_left, R.anim.activity_out_to_right);
}