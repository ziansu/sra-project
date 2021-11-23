private java.util.Optional<java.lang.Integer> levelToOptional(java.lang.String msg, java.util.Scanner scanner) {
    java.lang.String userInputStr = readInput(scanner, msg);
    java.lang.Integer i = parseInt(userInputStr);
    return i == null ? java.util.Optional.empty() : java.util.Optional.of(i);
}