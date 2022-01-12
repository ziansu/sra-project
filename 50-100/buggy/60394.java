static games.strategy.triplea.settings.validators.InputValidator inRange(int min, int max) {
    return ( value) -> {
        if (!(games.strategy.triplea.settings.validators.InputValidator.IS_INTEGER.apply(value))) {
            return false;
        }
        int intValue = java.lang.Integer.parseInt(value);
        return (intValue >= min) && (intValue <= intValue);
    };
}