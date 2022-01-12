public void resetTo(dyvil.tools.parsing.token.IToken token) {
    this.tokens.jump(token);
    if ((this.reportedMarkers) >= 0) {
        this.markers.remove(this.reportedMarkers);
    }
    if ((this.splitTokens) == null) {
        return ;
    }
    for (dyvil.tools.parsing.token.IToken splitToken : this.splitTokens) {
        splitToken.prev().setNext(splitToken);
        splitToken.next().setPrev(splitToken);
    }
    this.splitTokens.clear();
}