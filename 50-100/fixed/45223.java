public void showDailyAlarmNotification() {
    com.hcyclone.zen.Challenge challenge = com.hcyclone.zen.ChallengeModel.getInstance().getSerializedCurrentChallenge();
    if (challenge == null) {
        com.hcyclone.zen.Log.e(com.hcyclone.zen.NotificationService.TAG, "Ignore daily alarm notification as challenge is null");
        return ;
    }
    if ((challenge.getStatus()) != (Challenge.ACCEPTED)) {
        com.hcyclone.zen.Log.d(com.hcyclone.zen.NotificationService.TAG, "Ignore daily alarm notification as challenge not accepted");
        return ;
    }
    com.hcyclone.zen.Log.d(com.hcyclone.zen.NotificationService.TAG, "Show reminder alarm notification");
    showNotification(challenge.getContent(), challenge.getDetails());
}