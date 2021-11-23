public static void knockbackPlayer() {
    switch (game.Player.lastDir) {
        case 1 :
            game.Player.y += game.Player.size;
            game.Player.lastDir = 3;
            break;
        case 2 :
            game.Player.x += game.Player.size;
            game.Player.lastDir = 4;
            break;
        case 3 :
            game.Player.y -= game.Player.size;
            game.Player.lastDir = 1;
            break;
        case 4 :
            game.Player.x -= game.Player.size;
            game.Player.lastDir = 2;
            break;
        default :
            break;
    }
}