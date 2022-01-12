@java.lang.Override
public void onClick(android.view.View view) {
    if (selectionEnabled) {
        if ((toggleSelection) == 0) {
            setWaypointPosition(position);
        }else
            if ((toggleSelection) == 1) {
                if (!(((position % 15) > 12) || ((position / 15) < 2))) {
                    setRobotPosition(position);
                }
            }
        
    }
}