protected com.jeremydeanlakey.json.Jtoken peekToken() {
    if (!(peeking)) {
        peeking = true;
        peekedToken = nextToken();
    }
    return peekToken();
}