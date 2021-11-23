private void toggleChannel(java.lang.String ch) {
    int channel = (java.lang.Integer.parseInt(ch)) - 1;
    channels[channel] = !(channels[channel]);
}