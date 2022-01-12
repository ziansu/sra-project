@java.lang.Override
public void onClick(android.view.View v) {
    if ((flipper.getDisplayedChild()) == 0) {
        previous.setVisibility(View.VISIBLE);
    }
    if ((flipper.getDisplayedChild()) == 2) {
        skip();
    }
    flipper.showNext();
}