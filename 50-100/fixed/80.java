public java.lang.String getDefaultChallengeName() {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMM dd, yyyy", java.util.Locale.getDefault());
    java.util.Date date = new java.util.Date();
    java.lang.String dateStr = sdf.format(date);
    java.lang.String challengeName = dariogonzalez.fitplaygames.classes.ChallengeTypeConstants.getChallengeName(challengeType);
    return (challengeName + " ") + dateStr;
}