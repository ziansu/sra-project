public void keyPressed(int b) {
    if (b == (java.awt.event.KeyEvent.VK_ENTER)) {
        SelectOption();
    }
    if (b == (java.awt.event.KeyEvent.VK_UP)) {
        (currentOption)--;
        if ((currentOption) == (-1))
            currentOption = menuOptions.length;
        
    }
    if (b == (java.awt.event.KeyEvent.VK_DOWN)) {
        (currentOption)++;
        if ((currentOption) > (menuOptions.length)) {
            currentOption = 0;
        }
    }
}