public int[] getPlayerPos() {
    while ((((player_pos_x) == 0) && ((player_pos_y) == 0)) || ((setPlayerData) && (!(ready)))) {
    } 
    int[] player_pos_data = new int[2];
    player_pos_data[0] = 10;
    player_pos_data[1] = 10;
    return player_pos_data;
}