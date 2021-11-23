boolean equals(net.viktorc.detroid.framework.engine.Move m) {
    return (((((m != null) && ((from) == (m.from))) && ((to) == (m.to))) && ((movedPiece) == (m.movedPiece))) && ((capturedPiece) == (m.capturedPiece))) && ((type) == (m.type));
}