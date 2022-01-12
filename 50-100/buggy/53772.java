public void windowClosing(java.awt.event.WindowEvent e) {
    killThread = true;
    main.StatsDisplay sd = new main.StatsDisplay();
    sd.reset(game);
    sd.score = score;
    sd.time = time;
    sd.lastReset = lastReset;
    sd.updateStopped = updateStopped;
    sd.redraw();
    game.scoreWindow = sd;
}