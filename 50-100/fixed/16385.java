public void updateOdometry() {
    last_Wheel_Ticks.put(0, one.getCurrentPosition());
    last_Wheel_Ticks.put(1, two.getCurrentPosition());
    last_Wheel_Ticks.put(2, three.getCurrentPosition());
    last_Wheel_Ticks.put(3, four.getCurrentPosition());
}