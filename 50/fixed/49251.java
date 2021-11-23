public void processEvent(edu.cmu.scs.fluorite.commands.ICommand event) {
    edu.cmu.scs.fluorite.model.EventRecorder.getInstance().recordCommand(event);
}