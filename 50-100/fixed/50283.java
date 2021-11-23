public static void onTouch(android.view.MotionEvent event) {
    if ((xyz.scottz.scottpz.Game.lost) || (xyz.scottz.scottpz.Game.won))
        return ;
    
    if (xyz.scottz.scottpz.Game.shovelLogic.onTouch(event)) {
        return ;
    }
    if (xyz.scottz.scottpz.Game.sunLogic.onTouch(event)) {
        return ;
    }
    xyz.scottz.scottpz.Game.selectLogic.onTouch(event);
}