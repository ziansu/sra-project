private void stopRinging() {
    if (ringer.isRinging()) {
        ringer.stop();
        com.thevoiceasia.phonebox.calls.CallManagerPanel.LOGGER.info(xStrings.getString("CallManagerPanel.ringingStopped"));
    }else {
        if (((isOnCall()) == null) && ((ringingChannels.size()) > 0))
            playRinging();
        
    }
}