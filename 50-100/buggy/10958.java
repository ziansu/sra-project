public java.lang.Integer getGratitudesComplete() {
    java.lang.Integer gratitudeComplete = 0;
    for (java.lang.String gratitude : gratitudes) {
        gratitudeComplete += java.lang.Math.max(100, (((gratitude.length()) * 100) / (ai.victorl.toda.data.entry.Entry.MIN_ENTRY_LENGTH)));
    }
    return java.lang.Math.min(100, java.lang.Long.valueOf(java.lang.Math.round((gratitudeComplete / 3.0))).intValue());
}