public static void SetCzar(org.tilegames.hexicube.cah.client.ClientPlayer p) {
    for (org.tilegames.hexicube.cah.client.neoteny.gameLayers.ScoreBoard.Row row : org.tilegames.hexicube.cah.client.neoteny.gameLayers.ScoreBoard.rows) {
        if ((row.cp.id) == (p.id)) {
            row.white = false;
        }else {
            row.white = true;
        }
    }
}