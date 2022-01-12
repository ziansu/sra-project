@java.lang.Override
public tttx9.Move nextTurn(tttx9.GameState gs) {
    java.lang.System.out.println("zoeken naar nieuwe move");
    if ((gs.getLastMove()) == null)
        return new tttx9.Move(0, 0);
    
    for (int j = 0; j < 9; j++)
        if (gs.getNextSubGame().isFreeField(new tttx9.Move(gs.getNextSubGame().getId(), j)))
            return new tttx9.Move(gs.getNextSubGame().getId(), j);
        
    
    return null;
}