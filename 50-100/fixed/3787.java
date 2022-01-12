public void type(int input) {
    if (overwrite) {
        typed = ((long) (input));
        overwrite = false;
    }else {
        typed = (10L * (typed)) + input;
    }
    update(typed);
}