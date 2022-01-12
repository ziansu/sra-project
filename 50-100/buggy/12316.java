private void updateLowestPriorityAssignment() {
    mLowestPriorityConnection = null;
    for (audio.AudioManager.AudioOutputConnection connection : mAudioOutputConnections) {
        if ((connection.isConnected()) && (((mLowestPriorityConnection) == null) || ((mLowestPriorityConnection.getPriority()) > (connection.getPriority())))) {
            mLowestPriorityConnection = connection;
        }
    }
}