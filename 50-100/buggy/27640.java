public tv.twitch.vlcjplayer.physicx.Message readLine(java.lang.String line) throws java.io.IOException {
    this.logger.debug(line);
    if (line.startsWith("PING")) {
        this.write("PONG tmi.twitch.tv");
    }else
        if ((!(line.startsWith(":tmi.twitch.tv"))) && (!(line.contains(this.user)))) {
            tv.twitch.vlcjplayer.physicx.Message msg = new tv.twitch.vlcjplayer.physicx.Message(line);
            return msg;
        }
    
    return null;
}