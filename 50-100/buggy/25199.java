public void go_jail() {
    int turn_id = mygame.turn;
    stop(3);
    mygame.p_in_jail[turn_id] = 1;
    mygame.move_start = true;
    mygame.p_id[turn_id] = ((game_map.jail_id) - 1) % (game_map.Size);
    mygame.p_dest_id[turn_id] = game_map.jail_id;
}