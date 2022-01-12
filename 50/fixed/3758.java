@java.lang.Override
public void cleanup() {
    if ((this.trainer) != null) {
        this.trainer.terminateTraining(slaves);
    }
}