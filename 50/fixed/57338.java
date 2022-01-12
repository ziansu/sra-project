public void CheckEat() {
    if (eat()) {
        snake_x[snake_length] = tail_buffer_X;
        snake_y[snake_length] = tail_buffer_Y;
        (snake_length)++;
    }
}