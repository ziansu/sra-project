@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btnTimerPlay :
            com.mkhan.myapplication.TimerActivity.isTimerOn = true;
            togglePlayButtontext(((android.widget.Button) (v)));
            break;
        case R.id.btnTimerReset :
            com.mkhan.myapplication.TimerActivity.isTimerOn = false;
            togglePlayButtontext(((android.widget.Button) (v)));
            break;
    }
}