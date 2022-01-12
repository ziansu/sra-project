private java.util.Optional<java.lang.Integer> levelToOptional(java.lang.String msg, java.util.Scanner scanner) {
    java.lang.String userInputStr = readInput(scanner, msg);
    int i = parseInt(userInputStr);
    return i < 0 ? java.util.Optional.empty() : java.util.Optional.of(i);
}