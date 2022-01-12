private gui.AppWorker initializeAppWorker() {
    gui.AppWorker worker = new gui.AppWorker(this, gui.Dashboard.iterations, inputTextArea.getText());
    worker.addPropertyChangeListener(new gui.AppWorkerPropertyChangeListener(this, worker));
    return worker;
}