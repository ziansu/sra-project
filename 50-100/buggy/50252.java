@java.lang.Override
public com.verbosy.runtime.VerbosyValue getNextInput() {
    if (scanner.hasNextInt()) {
        return new com.verbosy.runtime.VerbosyValue(scanner.nextInt());
    }
    if (scanner.hasNext()) {
        char character = scanner.findWithinHorizon(".", 0).charAt(0);
        if (character == ' ') {
            return new com.verbosy.runtime.VerbosyValue(0);
        }
        return new com.verbosy.runtime.VerbosyValue(character);
    }
    return null;
}