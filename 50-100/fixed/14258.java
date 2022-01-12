public java.lang.String getGame() {
    if ((inputLine) == null) {
        return "";
    }else {
        com.eclipsesource.json.JsonObject jsonObj = com.eclipsesource.json.JsonObject.readFrom(inputLine);
        if ((this.isStreamLive()) == false) {
            return "";
        }else {
            if (jsonObj.get("stream").isObject()) {
                com.eclipsesource.json.JsonObject stream = ((com.eclipsesource.json.JsonObject) (jsonObj.get("stream")));
                return stream.get("game").toString();
            }
        }
        return "";
    }
}