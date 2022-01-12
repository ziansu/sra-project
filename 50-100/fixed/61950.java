@java.lang.Override
public void onClick(android.view.View v) {
    if (!(getClicked())) {
        if ((getS1()) == 8) {
            setClicked(true);
            C.setEnabled(true);
            Handler.postDelayed(Correct1, 1750);
        }else {
            IC.setEnabled(true);
            setClicked(true);
            Handler.postDelayed(InCorrect1, 1750);
        }
    }
}