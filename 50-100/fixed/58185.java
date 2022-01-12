public void battleSong() {
    if ((inCombat) == true) {
        forest1.stop();
        forest2.stop();
        cave.stop();
        battle.play();
    }else
        if ((inCombat) == false) {
            battle.stop();
            if ((inForest1) == true) {
                forest1.play();
            }else
                if ((inCave) == true) {
                    cave.play();
                }
            
        }
    
}