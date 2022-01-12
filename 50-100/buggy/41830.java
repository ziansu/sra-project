@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(this.getClass().equals(o.getClass())))
        return false;
    
    core.movement.MoveTable m = ((core.movement.MoveTable) (o));
    return this.moves.equals(m.moves);
}