@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.back_arrow_image :
            finish();
            break;
        case R.id.focused_action_fab :
            addEventView();
            break;
    }
}