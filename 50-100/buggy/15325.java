public long saveChallengeTag(cat.ie.challengeaccepted.to.ChallengeTag challengeTag) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(TablesContract.ChallengeTagContract._ID, challengeTag.getId());
    values.put(TablesContract.ChallengeTagContract.COLUMN_ID_CHALLENGE, challengeTag.getIdChallenge());
    values.put(TablesContract.ChallengeTagContract.COLUMN_ID_TAG, challengeTag.getIdTag());
    return database.replace(TablesContract.ChallengeTagContract.TABLE_NAME, null, values);
}