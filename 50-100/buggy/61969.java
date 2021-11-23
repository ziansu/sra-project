@java.lang.Override
public void TellResult() {
    java.lang.Integer result = peasant.MultiplyNumbers(first, second);
    if (result == null) {
        Say(java.lang.String.format("I couldn't calculate %d times %d", first, second));
    }
    Say(java.lang.String.format("%d times %d is: %s", first, second, peasant.getResultAsString(result)));
}