public final void cancel() {
    if (!(started)) {
        return ;
    }
    finishProgressBar(true);
    if (iOwnOutput) {
        com.github.tomaslanger.cli.progress.StreamHandler.replaceBack();
    }
    iOwnOutput = false;
    started = false;
}