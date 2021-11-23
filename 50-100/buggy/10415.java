public void update(double timestep) {
    xVel += (timestep * (xForce)) / (mass);
    yVel += (timestep * (yForce)) / (mass);
    x += timestep * (xVel);
    y += timestep * (yVel);
}