protected void testChat(java.lang.String topic, java.lang.String message) {
    java.lang.String[] topics = new java.lang.String[]{ "placeArmies" , "attackPhase" , "calculateLandgrabObjective" , "findWeakestNeighborWithMostEnemyNeighbors" , "" };
    for (int i = 0; i < (topics.length); i++) {
        if (topic == (topics[i])) {
            board.sendChat(message);
        }
    }
}