@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(this.getClass().equals(o.getClass())))
        return false;
    
    return this.ghost.equals(((core.game.Pawn) (o)).ghost);
}