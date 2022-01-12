private void shopDetection(com.mygdx.runrunrun.sprites.MoveableObject firstObj) {
    shop = ((com.mygdx.runrunrun.sprites.Shop) (firstObj));
    if ((firstObj.contains(hero.getPosition())) && ((firstObj.getHide()) == false)) {
        stopForShop = true;
        if ((flyCount) <= 0)
            exitShopTimer = 100;
        
    }else {
        stopForShop = false;
        enteredShop = false;
        if (hero.getStop()) {
            hero.toggleStop(false);
        }
    }
}