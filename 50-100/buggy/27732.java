@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(this.getClass().equals(o.getClass())))
        return false;
    
    core.movement.Move m = ((core.movement.Move) (o));
    return ((this.x) == (m.x)) && ((this.y) == (m.y));
}