public void setup(java.lang.String to) {
    for (int i = 0; i < 2; i++) {
        if (handler[i].clientName.equals(to)) {
            handler[i].outputStream.println("Game On! Press Enter to continue:");
            break;
        }
    }
}