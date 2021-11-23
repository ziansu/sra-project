public boolean isHandshakeRequest() {
    if ((((this.RequestMap.containsKey("TYPE")) && (this.RequestMap.get("TYPE").equals("SERVICE"))) && (this.RequestMap.containsKey("NAME"))) && (this.RequestMap.containsKey("END"))) {
        return true;
    }
    return false;
}