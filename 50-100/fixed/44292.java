@java.lang.Override
public void onClick(android.view.View view) {
    if ((selectionEnabled) && (!(((position % 15) > 12) || ((position / 15) < 2)))) {
        if ((toggleSelection) == 0)
            setWaypointPosition(position);
        else
            if ((toggleSelection) == 1)
                setRobotPosition(position);
            
        
    }
}