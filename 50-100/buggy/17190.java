public void incrementResultForGoodAnswer() {
    if ((playerObejtID.getUserObjectID()) == (NewGameActivity.result.getFirstUSerObjectID())) {
        NewGameActivity.result.Increment1stUserResult();
        NewGameActivity.result.publishResults(this, bundle);
    }
    if ((playerObejtID.getUserObjectID()) == (NewGameActivity.result.getSecondUSerObjectID())) {
        NewGameActivity.result.Increment2ndUserResult();
        NewGameActivity.result.publishResults(this, bundle);
    }
}