@java.lang.Override
protected boolean assignRoomType() {
    super.assignRoomType();
    for (com.shatteredpixel.shatteredpixeldungeon.levels.Room r : rooms) {
        if ((r.type) == (com.shatteredpixel.shatteredpixeldungeon.levels.Room.Type.TUNNEL)) {
            r.type = com.shatteredpixel.shatteredpixeldungeon.levels.Room.Type.PASSAGE;
        }
    }
    return true;
}