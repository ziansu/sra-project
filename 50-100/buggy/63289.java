public void move(double timeStep) {
    double temp;
    for (int i = 0; i < 3; i++) {
        prevPosition[i] = position[i];
        position[i] = ((position[i]) + ((velocity[i]) * timeStep)) + ((((deltaAccel[i]) * timeStep) * timeStep) * 0.5);
        velocity[i] += deltaAccel[i];
    }
}