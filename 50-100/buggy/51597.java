private com.mygdx.game.customEnum.MapTile[] genPower(com.mygdx.game.customEnum.MapTile[] new_row) {
    while (true) {
        int temp = mapRandomizer.nextInt(9);
        if ((new_row[temp]) == (com.mygdx.game.customEnum.MapTile.EMPTY)) {
            new_row[temp] = com.mygdx.game.customEnum.MapTile.POWER;
            powerCounter = 0;
            break;
        }
    } 
    return new_row;
}