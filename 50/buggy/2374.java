public void sendMidiChannelAftertouch(int channel, int pressure) {
    sendMidiMessage((208 | (channel & 15)), pressure, 0);
}