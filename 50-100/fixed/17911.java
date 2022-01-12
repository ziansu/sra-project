@java.lang.Override
public java.util.List<obj.Triangle> getTris() {
    if (!(calcTris.isEmpty()))
        return calcTris;
    
    if ((detail) == 0)
        return tris;
    
    getTris(tris);
    for (int i = 0; i < ((detail) - 1); i++) {
        getTris(calcTris);
    }
    return calcTris;
}