@java.lang.Override
public void onClick(android.view.View view) {
    if (!(mOptionsVisible)) {
        mOptionsVisible = !(mOptionsVisible);
        animationOptionsOntoScreen();
    }
}