@java.lang.Override
public boolean equals(java.lang.Object obj) {
    models.State o = ((models.State) (obj));
    for (int i = 0; i < (tileList.size()); i++) {
        if (!(tileList.get(i).equals(o.tileList.get(i))))
            return false;
        
    }
    return true;
}