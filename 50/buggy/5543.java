public void update() throws Model.UserOverflowException {
    erase();
    if ((state) != (UserState.OFF)) {
        uid = getNewId();
        current_time = new java.util.Date();
        write();
    }
}