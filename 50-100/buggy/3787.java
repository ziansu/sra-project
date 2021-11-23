public void type(int input) {
    if (overwrite) {
        value = ((long) (input));
        overwrite = false;
    }else {
        value = (10L * (value)) + input;
    }
    typed = value;
    update();
}