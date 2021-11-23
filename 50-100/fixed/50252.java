@java.lang.Override
public com.verbosy.runtime.VerbosyValue getNextInput() {
    if (scanner.hasNextInt()) {
        return new com.verbosy.runtime.VerbosyValue(scanner.nextInt());
    }
    java.lang.String token = scanner.findWithinHorizon(".", 0);
    if (token == null) {
        return null;
    }else
        if ((token.charAt(0)) == ' ') {
            return new com.verbosy.runtime.VerbosyValue(0);
        }else {
            return new com.verbosy.runtime.VerbosyValue(token.charAt(0));
        }
    
}