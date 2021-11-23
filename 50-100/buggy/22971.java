@java.lang.Override
public synchronized void run() {
    while (true) {
        DrumMachineUI.player.setTimeSignature4(DrumMachineUI.controlPanel.getTimeSignature());
        if (DrumMachineUI.controlPanel.isPlaying()) {
            java.lang.System.out.println("Test1");
            DrumMachineUI.rhythmPanel.play();
            try {
                java.lang.Thread.sleep(((60000 / (DrumMachineUI.controlPanel.getTempo())) / 4));
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
}