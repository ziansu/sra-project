public void practiceSpell(boolean success, java.util.Date now) {
    boolean practiced = false;
    if ((castAttemptsToday) < (com.dreaminsteam.rpbot.db.models.Spellbook.MAX_ATTEMPTS_PER_DAY)) {
        practiced = true;
        (castAttemptsToday)++;
    }
    if (practiced) {
        lastCastAttempt = now;
        practiceSuccessful = success;
        if (practiceSuccessful) {
            (currentIndividualModifierPoints)++;
        }
    }
}