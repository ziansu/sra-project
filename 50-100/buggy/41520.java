protected void mfPlayWithLoveca() {
    while (true) {
        while ((finalLp) >= (getMfLpWithinOncePlay())) {
            mfPlayOnceWithEnoughLp();
            while ((finalExperience) >= (getCurrentRankUpExp())) {
                upgradeOneRankWithEnoughExp();
            } 
        } 
        if ((finalPoints) <= (objectivePoints)) {
            consumeOneLoveca();
        }else {
            break;
        }
    } 
}