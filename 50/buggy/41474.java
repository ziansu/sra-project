@java.lang.Override
public void run() {
    this.setEngineStatus(RunStatus.Running);
    this.notifyEngineAboutToStart();
    if (!(debugging)) {
        vm.run();
    }else {
        vm.debug();
    }
}