public void setUserPreference(com.leaf.clips.model.usersetting.Setting setting) {
    switch (setting.getPathPreference()) {
        case ELEVATOR_PREFERENCE :
            userElevatorPreference = 0;
            userStairPreference = 1;
            break;
        case STAIR_PREFERENCE :
            userStairPreference = 0;
            userElevatorPreference = 1;
            break;
        default :
            userElevatorPreference = 0;
            userStairPreference = 0;
    }
}