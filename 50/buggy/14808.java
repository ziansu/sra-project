protected void startTask() {
    runTaskTimerAsynchronously(org.bitbucket.ucchy.undine.UndineMailer.getInstance(), 0, ((20 * 60) * 60));
}