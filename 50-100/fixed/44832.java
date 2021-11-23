@java.lang.Override
public void onClick(android.view.View v) {
    android.location.Location tempLocation = new android.location.Location("");
    tempLocation.setLatitude(currentMarker.getPosition().latitude);
    tempLocation.setLongitude(currentMarker.getPosition().longitude);
    switch (locationType) {
        case 1 :
            updateHomeLocation(tempLocation);
            break;
        case 2 :
            updateWorkLocation(tempLocation);
            break;
        default :
    }
}