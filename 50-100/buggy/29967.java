@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((o == null) || ((o.getClass()) != (this.getClass())))
        return false;
    
    version_3.TakenNames.ThreadTracker t = ((version_3.TakenNames.ThreadTracker) (o));
    return (!(t.name.equals(name))) || ((t.completable) != (completable));
}