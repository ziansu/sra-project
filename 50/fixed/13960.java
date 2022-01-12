public final synchronized void end() {
    if (!(started)) {
        return ;
    }
    finishProgressBar(false);
    com.github.tomaslanger.cli.progress.StreamHandler.replaceBack(replace);
    iOwnOutput = false;
    started = false;
}