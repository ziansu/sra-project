@java.lang.Override
public void run() {
    alarmStartUpHelpers.AlarmsStartupReader asr = new alarmStartUpHelpers.AlarmsStartupReader();
    try {
        asr.readAndReconstructAlarms();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    while (true) {
        java.lang.String date = this.getTime();
        this.label.setText(date);
        this.repaint();
    } 
}