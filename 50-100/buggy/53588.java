public boolean isRapidReClick(int id) {
    if (id == (reClickId)) {
        if (((com.amcolabs.quizapp.configuration.Config.getCurrentNanos()) - (lastClick)) > 1000000000) {
            lastClick = com.amcolabs.quizapp.configuration.Config.getCurrentNanos();
            return false;
        }
        lastClick = com.amcolabs.quizapp.configuration.Config.getCurrentNanos();
        return true;
    }
    return false;
}