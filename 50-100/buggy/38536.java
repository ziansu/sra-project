public void practiceSpell(boolean success, java.util.Date now) {
    boolean practiced = false;
    if (hasPracticedToday(now)) {
        if ((!(practiceSuccessful)) && ((castAttemptsToday) < (com.dreaminsteam.rpbot.db.models.Spellbook.MAX_ATTEMPTS_PER_DAY))) {
            (castAttemptsToday)++;
            practiced = true;
        }
    }else {
        castAttemptsToday = 1;
        practiced = true;
    }
    if (practiced) {
        lastCastAttempt = now;
        practiceSuccessful = success;
        if (practiceSuccessful) {
            (currentIndividualModifierPoints)++;
        }
    }
}