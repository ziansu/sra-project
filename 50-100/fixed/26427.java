private void updateFloatingScores(float deltaFloat) {
    java.util.Iterator<logic.FloatingScore> scoreListIterator = floatingScoreList.iterator();
    synchronized(scoreListIterator) {
        while (scoreListIterator.hasNext()) {
            logic.FloatingScore score = scoreListIterator.next();
            if (score.isDead()) {
                scoreListIterator.remove();
            }else {
                score.update(deltaFloat, timeDelta);
            }
        } 
    }
}