private void setImageViewOwner(com.MagikSquirrel.backgammon.imgBoard.Player player, android.widget.ImageView iv) {
    try {
        if (player == (com.MagikSquirrel.backgammon.imgBoard.Player.BLACK)) {
            iv.setImageBitmap(bmBlack);
            iv.setVisibility(View.VISIBLE);
        }else
            if (player == (com.MagikSquirrel.backgammon.imgBoard.Player.WHITE)) {
                iv.setImageBitmap(bmWhite);
                iv.setVisibility(View.VISIBLE);
            }else {
                iv.setImageBitmap(bmClear);
                iv.setVisibility(View.INVISIBLE);
            }
        
    } catch (java.lang.Exception e) {
    }
}