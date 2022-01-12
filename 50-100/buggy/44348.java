@java.lang.Override
public int compareTo(models.State o) {
    for (int i = 0; i < (tileList.size()); i++) {
        if (!(tileList.get(i).equals(o.tileList.get(i))))
            return -1;
        
    }
    return 0;
}