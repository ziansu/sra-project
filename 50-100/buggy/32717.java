public void loadAndRunEmojiWork() {
    if ((enableAll.isSelected()) || (enableTwitchBadges.isSelected())) {
        java.util.Set<com.glitchcog.fontificator.emoji.EmojiJob> jobs = collectJobs();
        if (jobs.isEmpty()) {
            progressPanel.log("No new work found.");
        }else {
            loadEmojiWork(jobs);
        }
        runEmojiWork();
    }
    progressPanel.handleButtonEnables();
}