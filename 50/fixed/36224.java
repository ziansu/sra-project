@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof chessmaster.Resource) {
        chessmaster.Resource r = ((chessmaster.Resource) (obj));
        return (id) == (r.id);
    }else
        return false;
    
}