@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((o == null) || (!(this.getClass().equals(o.getClass()))))
        return false;
    
    core.board.Case c = ((core.board.Case) (o));
    return (((this.x) == (c.x)) && ((this.y) == (c.y))) && ((this.board) == (c.board));
}