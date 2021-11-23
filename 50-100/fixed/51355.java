public void IO() {
    if (isShift()) {
        if ((getSU_macro_bindings()[6]) != null) {
            getSU_macro_bindings()[6].execute();
        }
    }else {
        if (!(isProgramRunning())) {
            activeRobot.toggleEEState();
        }
    }
}