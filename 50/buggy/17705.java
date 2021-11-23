public int getDelayBeforeResponseMs() {
    return this.sharedPreferencesUtility.getIntValue("delay_before_response_ms", 30000);
}