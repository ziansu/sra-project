private void Play() {
    if (((recordTime.time()) >= 0.1) && ((index) <= ((Recording.size()) - 2))) {
        recordTime.reset();
        Gamepad1 = Recording.get(index);
        (index)++;
        Gamepad2 = Recording.get(index);
        (index)++;
    }
}