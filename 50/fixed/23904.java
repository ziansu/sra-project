@java.lang.Override
public void onClick(android.view.View view) {
    if (mEnabled) {
        setState(getNextState(), true);
    }
}