private com.hutgroup.robocode.server.RoundResult toRoundResult(int roundId, com.hutgroup.robocode.server.IRobotSnapshot robotSnapshot) {
    double energyLeft = robotSnapshot.getEnergy();
    com.hutgroup.robocode.server.IScoreSnapshot snapshot = robotSnapshot.getScoreSnapshot();
    java.lang.String playerId = robotSnapshot.getName();
    double gunDamage = (snapshot.getCurrentBulletDamageScore()) + (snapshot.getCurrentBulletKillBonus());
    double ramDamage = (snapshot.getCurrentRammingDamageScore()) + (snapshot.getCurrentRammingKillBonus());
    return new com.hutgroup.robocode.server.RoundResult(roundId, playerId, energyLeft, ramDamage, gunDamage);
}