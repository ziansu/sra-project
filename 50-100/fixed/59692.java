@java.lang.Override
public void setArguments(android.os.Bundle arguments) {
    if (arguments != null) {
        if (arguments.containsKey("timer")) {
            timerSeconds = arguments.getInt("timer");
        }
        if (arguments.containsKey("notification")) {
            timerSeconds = arguments.getInt("notification");
        }
    }
}