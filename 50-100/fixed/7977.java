@java.lang.Override
public void run() {
    while (proc.isAlive()) {
    } 
    java.lang.System.out.println("end");
    java.util.List<main.Tuple<?, ?>> recorded = sessionController.end();
    startFrame.setState(java.awt.Frame.NORMAL);
    isRecording = false;
    gui.StartScreen.RCDRFileSelect fileSelect = new gui.StartScreen.RCDRFileSelect(this);
    fileSelect.save(recorded);
    java.lang.System.out.println("ended");
    return ;
}