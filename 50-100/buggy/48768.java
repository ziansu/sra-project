public foo.Timestamp shift(int ms) {
    addAndCarry(seconds, milliseconds, 1000, (ms % 1000));
    addAndCarry(minutes, seconds, 60, ((ms / 1000) % 60));
    addAndCarry(hours, minutes, 60, ((ms / 60000) % 60));
    if ((hours.val) < 0) {
        milliseconds.val = 0;
        seconds.val = 0;
        minutes.val = 0;
        hours.val = 0;
    }
    return this;
}