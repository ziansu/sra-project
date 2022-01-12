protected com.jeremydeanlakey.json.Jtoken peekToken() {
    if (!(peeking)) {
        peekedToken = nextToken();
        peeking = true;
    }
    return peekedToken;
}