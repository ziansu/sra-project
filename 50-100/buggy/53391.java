public void setUserPreference(com.leaf.clips.model.usersetting.Setting setting) {
    switch (setting.getPathPreference()) {
        case ELEVATOR_PREFERENCE :
            userElevatorPreference = 1;
            userStairPreference = 0;
            break;
        case STAIR_PREFERENCE :
            userStairPreference = 1;
            userElevatorPreference = 0;
            break;
        default :
            userElevatorPreference = 0;
            userStairPreference = 0;
    }
}