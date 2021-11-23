public boolean isPhoneUnlockedInterpretedAsNotRiding() {
    return this.sharedPreferencesUtility.getBooleanValue("phone_unlocked_interpreted_as_not_riding", true);
}