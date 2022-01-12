private void consumeStateResponse() throws java.io.IOException {
    java.lang.String state = this.out.readLine();
    if (state.equals("data: Keyboard locked")) {
        log("KEYBOARD LOCKED");
        state = this.out.readLine();
    }
    java.lang.String confirm = this.out.readLine();
    log((((("State: " + state) + "\nConfirm: ") + confirm) + '\n'));
    if (!(confirm.equals("ok"))) {
        java.lang.System.err.println("> Error: Bad Request");
    }
}