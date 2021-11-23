public static void main(java.lang.String[] args) {
    new PicPuzzle2();
    if (!(PicPuzzle2.gameWon())) {
        PicPuzzle2.win.setVisible(false);
    }else
        PicPuzzle2.win.setVisible(true);
    
}