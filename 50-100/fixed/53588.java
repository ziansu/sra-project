public boolean isRapidReClick(int id) {
    if (id == (reClickId)) {
        if (((com.amcolabs.quizapp.configuration.Config.getCurrentNanos()) - (lastClick)) > 1000000000) {
            lastClick = com.amcolabs.quizapp.configuration.Config.getCurrentNanos();
            reClickId = 0;
            return false;
        }
        lastClick = com.amcolabs.quizapp.configuration.Config.getCurrentNanos();
        return true;
    }
    reClickId = id;
    return false;
}