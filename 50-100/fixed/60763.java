public static void play_cpu(Myboard board_missiles, Myboard enemy_board_ships) {
    java.util.Random Random = new java.util.Random();
    int row = (Random.nextInt(9)) + 0;
    int column = (Random.nextInt(9)) + 0;
    Mygame.play(enemy_board_ships, board_missiles, row, column);
}