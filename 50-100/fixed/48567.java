public float getAvgWheelSpeedXYZ() {
    float speed = 0;
    if (((wheels) != null) && ((wheels.length) >= 4)) {
        speed = ((float) ((((wheels[0].getSpeedXYZ()) + (wheels[1].getSpeedXYZ())) + (wheels[2].getSpeedXYZ())) + (wheels[3].getSpeedXYZ()))) / 4;
    }
    return speed;
}