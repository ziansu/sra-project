public Mazerush.Player update_objects(Mazerush.Maze maze, Mazerush.Player player) {
    player = update_player(false, maze, player);
    player = update_pow(player);
    if ((player_on_color(Mazerush.mazegoalcolor, 0, 0, maze, player)) && (!(player.maze_completed)))
        player.maze_completed = true;
    
    if (!(player.maze_completed))
        player.completedtime += Mazerush.objectupdate_bandwidth;
    
    if (player_on_color(Mazerush.mazeorigincolor, 0, 0, maze, player))
        player.completedtime = 0;
    
    return player;
}