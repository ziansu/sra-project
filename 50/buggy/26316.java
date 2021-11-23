public void start() {
    hasUI = true;
    if (hasUI) {
        UI.Dashboard demo = new UI.Dashboard();
    }else {
        main.Main.work(this);
    }
}