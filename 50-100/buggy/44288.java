protected org.eviline.core.ShapeType[] createGameNext(org.zeromeaner.game.play.GameEngine engine, int seq) {
    int size = java.lang.Math.min(((engine.nextPieceArraySize) - seq), (((lookahead) + (pipeLength)) + 2));
    org.eviline.core.ShapeType[] nextShapes = new org.eviline.core.ShapeType[size];
    for (int i = 0; i < size; i++)
        nextShapes[i] = org.zeromeaner.game.eviline.XYShapeAdapter.toShapeType(engine.getNextObject((seq + i)));
    
    return nextShapes;
}