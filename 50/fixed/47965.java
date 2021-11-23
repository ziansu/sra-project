public void ballResetInitialDirection() {
    if ((ball_speed_horizontal) < 0)
        ball_speed_horizontal *= -1;
    
    if ((ball_speed_vertical) > 0)
        ball_speed_vertical *= -1;
    
}