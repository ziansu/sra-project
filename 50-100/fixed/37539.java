@java.lang.Override
public void run() {
    super.run();
    if (this.isTimepointsGraph) {
        this.graphPanel = this.prepareTimepointsGraph(this.maxT);
    }else {
        this.graphPanel = this.prepareTracksGraph(true);
    }
    this.updateStatus(true);
}