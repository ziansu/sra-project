public static boolean isCommandValid(byte[] command) {
    if ((command != null) && ((command[1]) == (command.length))) {
        return true;
    }
    return false;
}