protected void mfPlayWithLoveca() {
    while (true) {
        while ((finalLp) >= (getMfLpWithinOncePlay())) {
            mfPlayOnceWithEnoughLp();
        } 
        if ((finalPoints) < (objectivePoints)) {
            consumeOneLoveca();
        }else {
            break;
        }
    } 
}