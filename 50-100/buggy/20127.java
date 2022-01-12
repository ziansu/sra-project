private void assessSelfInterested() {
    for (int i = 0; i < (self.getNumPieces()); ++i) {
        if ((peer.hasPiece(i)) && (!(self.hasPiece(i)))) {
            selfIsInterested = true;
        }
    }
    selfIsInterested = false;
}