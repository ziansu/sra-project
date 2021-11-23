@java.lang.Override
public void onNextValidated() {
    if ((view) != null) {
        view.enableNext();
    }
}