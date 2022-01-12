@java.lang.Override
public void setArguments(android.os.Bundle arguments) {
    super.setArguments(arguments);
    if (getArguments().containsKey("timer")) {
        timerSeconds = getArguments().getInt("timer");
    }
    if (getArguments().containsKey("notification")) {
        timerSeconds = getArguments().getInt("notification");
    }
}