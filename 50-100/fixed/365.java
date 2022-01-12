private void nextBatter() {
    if ((game.teamAtBat) == 0) {
        (game.vLineupBatter)++;
        if ((game.vLineupBatter) > 8) {
            game.vLineupBatter = 0;
        }
        game.vBatter = vTeam.roster.get(game.vLineupBatter);
    }else {
        (game.hLineupBatter)++;
        if ((game.hLineupBatter) > 8) {
            game.hLineupBatter = 0;
        }
        game.hBatter = hTeam.roster.get(game.hLineupBatter);
    }
}