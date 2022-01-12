@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((this.getClass()) != (obj.getClass()))
        return false;
    
    ab.demo.solver.Theory other = ((ab.demo.solver.Theory) (obj));
    return this.beginState.equals(other.getBeginState());
}