@java.lang.Override
public void refreshContent() {
    if ((this.donationControl) != null) {
        this.donationControl.refreshData();
    }
    this.redrawContent();
}