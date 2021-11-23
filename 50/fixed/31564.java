public void backSpace() {
    int origin_len = command.length();
    if ((command.length()) != 0) {
        command.setLength((origin_len - 1));
    }
}