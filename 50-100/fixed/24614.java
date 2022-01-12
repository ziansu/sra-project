@java.lang.Override
public void onClick(android.view.View v) {
    switch (getPageId()) {
        case 1 :
            displayViewPMain();
            break;
        case 2 :
            displayViewP1();
            btPrev.setText("Cancel");
            break;
        case 3 :
            displayViewP2();
            btNext.setText("Next");
            break;
        default :
    }
}