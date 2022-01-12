public void incrementResultForGoodAnswer() {
    if (playerObejtID.getUserObjectID().equals(NewGameActivity.result.getFirstUSerObjectID())) {
        NewGameActivity.result.Increment1stUserResult();
        NewGameActivity.result.publishResults(this, bundle);
    }
    if (playerObejtID.getUserObjectID().equals(NewGameActivity.result.getSecondUSerObjectID())) {
        NewGameActivity.result.Increment2ndUserResult();
        NewGameActivity.result.publishResults(this, bundle);
    }
}