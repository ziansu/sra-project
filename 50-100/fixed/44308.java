private static engine.CellState[] getAliveStates() {
    if (engine.InitialStructure.isQuadState) {
        engine.CellState[] aliveStates;
        aliveStates = new engine.CellState[(engine.QuadState.values().length) - 1];
        int i = 0;
        for (engine.CellState s : engine.QuadState.values()) {
            if (s == (QuadState.DEAD))
                continue;
            
            aliveStates[(i++)] = s;
        }
        return aliveStates;
    }
    return null;
}