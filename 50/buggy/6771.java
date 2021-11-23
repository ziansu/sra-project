public void run() {
    if ((t.canceled) > 0) {
        ballPickups.add(new ca.team2706.scouting.mcmergemanager.datamodels.BallPickup(t.canceled, t.upTimer.currentTime()));
    }
}