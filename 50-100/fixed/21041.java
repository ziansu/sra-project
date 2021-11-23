@java.lang.Override
public void responseMessage(java.lang.String response) {
    dispatchListenerEvents(SerialCommunicatorEvent.RAW_RESPONSE, response);
    if (processedCommand(response)) {
        if (((this.activeCommandList) != null) && ((this.activeCommandList.size()) > 0)) {
            com.willwinder.universalgcodesender.types.GcodeCommand command = this.activeCommandList.pop();
            this.sentBufferSize -= (command.getCommandString().length()) + 1;
            if ((this.sendPaused) == false) {
                this.streamCommands();
            }
        }
    }
}