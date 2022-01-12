public java.lang.String dumpColor(int grid, int index) {
    de.htwg.sa.nmm.model.IToken t = gamefield.field(grid, index).getToken();
    if (t == null) {
        return "";
    }else
        if (t.color().equals(java.awt.Color.WHITE)) {
            return "WHITE";
        }
    
    return "BLACK";
}