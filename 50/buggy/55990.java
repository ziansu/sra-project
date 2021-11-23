public java.lang.String violationMessage() {
    java.lang.String comparatorHumanReadable = getHumanReadableComparator();
    java.lang.String message = ("Should be " + comparatorHumanReadable) + (value);
    return message;
}