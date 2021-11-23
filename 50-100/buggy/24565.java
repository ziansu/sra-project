public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    switch (msg.what) {
        case se.chalmers.datx02_15_36.studeraeffektivt.activity.TimerFrag.TIMER_1 :
            android.os.Bundle b = msg.getData();
            long serviceInt = b.getLong("timePassed", (-1));
            setTimerView(serviceInt);
            break;
        case se.chalmers.datx02_15_36.studeraeffektivt.activity.TimerFrag.CHANGE_COLOR_0 :
            setProgressColor(Color.GREEN);
            insertIntoDataBase();
            break;
        case se.chalmers.datx02_15_36.studeraeffektivt.activity.TimerFrag.CHANGE_COLOR_1 :
            setProgressColor(Color.BLUE);
            break;
    }
}