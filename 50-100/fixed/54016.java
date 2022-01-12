public void footageMenu(int index) {
    if (uic.checkMenuItemState("footage", index)) {
        switch (index) {
            case 0 :
                openButton();
                break;
            case 1 :
                openButton2();
                break;
            case 3 :
                playButton();
                break;
            case 5 :
                ejectButton();
                break;
            default :
        }
    }
}