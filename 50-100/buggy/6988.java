@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.btn_start :
            startLevel(0);
            break;
        case R.id.btn_level_easy :
            startLevel(1);
            break;
        case R.id.btn_level_difficult :
            startLevel(2);
            break;
        case R.id.btn_level_medium :
            startLevel(3);
            break;
    }
}