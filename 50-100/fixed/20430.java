private int writeMessage(short[] pcmData, short[] dataBuffer, int msgStart, int msgLength) {
    if ((msgStart + msgLength) <= (pcmData.length)) {
        for (int i = 0; i < msgLength; ++i) {
            pcmData[(msgStart + i)] = dataBuffer[i];
        }
        return ch.ethz.asl.dancebots.danceboteditor.utils.DanceBotError.NO_ERROR;
    }else {
        android.util.Log.d(ch.ethz.asl.dancebots.danceboteditor.model.ChoreographyManager.LOG_TAG, "ERROR: writeMessage out of bounds");
        return ch.ethz.asl.dancebots.danceboteditor.utils.DanceBotError.WRITE_ERROR;
    }
}