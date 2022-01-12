private void consumeStateResponse() throws java.io.IOException {
    java.lang.String state = this.out.readLine();
    if (state.equals("data: Keyboard locked")) {
        state = this.out.readLine();
    }
    java.lang.String confirm = this.out.readLine();
    if (!(confirm.equals("ok"))) {
        java.lang.System.err.println("> Error: Bad Request");
    }
}