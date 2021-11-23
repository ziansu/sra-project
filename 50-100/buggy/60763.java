public static void play_cpu(Myboard enemy_board_ships, Myboard board_missiles) {
    java.util.Random Random = new java.util.Random();
    int row = (Random.nextInt(9)) + 0;
    int column = (Random.nextInt(9)) + 0;
    Mygame.play(enemy_board_ships, board_missiles, row, column);
}