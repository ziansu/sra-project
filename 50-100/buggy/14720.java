@java.lang.Override
public void onResume() {
    super.onResume();
    this.isPaused = false;
    this.slidingUpPanelLayout.restore();
    if (needToChange) {
        if (getOnBusState()) {
            cl.smartcities.isci.transportinspector.utils.Bus bus = getBus();
            this.showOnBusReportPanel(bus);
            this.slidingUpPanelLayout.showFabIcon();
            showPanel();
        }else {
            this.hideReportPanel();
        }
        needToChange = false;
    }
}