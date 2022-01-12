private void setImageViewOwner(com.MagikSquirrel.backgammon.imgBoard.Player player, android.widget.ImageView iv) {
    try {
        if (player == (com.MagikSquirrel.backgammon.imgBoard.Player.BLACK)) {
            iv.setImageBitmap(bmBlack);
        }else
            if (player == (com.MagikSquirrel.backgammon.imgBoard.Player.WHITE)) {
                iv.setImageBitmap(bmWhite);
            }else {
                iv.setImageBitmap(bmClear);
            }
        
    } catch (java.lang.Exception e) {
    }
}