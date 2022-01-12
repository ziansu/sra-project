@java.lang.Override
public void run() {
    java.lang.String s = "";
    if (type == (com.mobvoi.android.gesture.GestureType.TYPE_TWICE_TURN_WRIST)) {
        s = "turn wrist twice";
        new com.theteamgo.fancywatch.MainActivity.StartGestureMessageTask().execute(Constant.CONTROL_TYPE_NEXT);
    }else
        if (type == (com.mobvoi.android.gesture.GestureType.TYPE_TURN_WRIST_UP)) {
            s = "turn wrist up";
        }else
            if (type == (com.mobvoi.android.gesture.GestureType.TYPE_TURN_WRIST_DOWN)) {
                s = "turn wrist down";
            }else {
                s = "unknown gesture";
            }
        
    
}