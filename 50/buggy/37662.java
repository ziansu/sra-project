private void refreshSpeaker() {
    clockEnd = apple.clock;
    int bytes;
    if ((line) == null)
        return ;
    
    while ((bytes = fillBuffer()) > 0) {
        line.write(buffer, 0, bytes);
    } 
}