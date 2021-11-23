public void set(float out) {
    if (out != (last)) {
        output.event();
    }
}