@java.lang.Override
public java.lang.String apply(java.lang.String input) {
    if (input == null) {
        throw new java.lang.NullPointerException(("Given input is null: " + input));
    }
    return input.toLowerCase();
}