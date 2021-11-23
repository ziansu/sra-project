private void displayBtn() {
    if ((player.getDisplayState()) == (CustomPlayer.DISPLAY_SMALL)) {
        ib_screen.setImageResource(R.mipmap.icon_full_screen);
        isFull = false;
    }else
        if ((player.getDisplayState()) == (CustomPlayer.DISPLAY_FULL)) {
            ib_screen.setImageResource(R.mipmap.icon_crop_screen);
            isFull = true;
        }
    
}