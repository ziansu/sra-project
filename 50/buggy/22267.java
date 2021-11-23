private boolean hasCustomInvalidMessage() {
    final boolean result = org.spine3.validate.Validate.isDefault(ifInvalidOption);
    return result;
}