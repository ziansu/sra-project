public void printMonsters(net.slashie.libjcsi.wswing.WSwingConsoleInterface j, characters.active.ActiveCharacter user) {
    for (map.Room room : getRooms()) {
        if (user.getRoom().equals(room)) {
            for (characters.active.ActiveCharacter enemy : room.getMonsters()) {
                if (!(enemy.isDead())) {
                    if (util.RandUtil.containsTuple(enemy.getPosition(), user.getVisiblePositions())) {
                        room.printMonsters(j, user.getVisiblePositions());
                    }
                }
            }
        }
    }
}