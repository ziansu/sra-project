public static void knockbackPlayer() {
    switch (game.Player.lastDir) {
        case 1 :
            game.Player.y += game.Player.size;
            break;
        case 2 :
            game.Player.x += game.Player.size;
            break;
        case 3 :
            game.Player.y -= game.Player.size;
            break;
        case 4 :
            game.Player.x -= game.Player.size;
            break;
        default :
            break;
    }
}