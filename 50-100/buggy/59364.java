private boolean isIdentity() {
    for (int i = 0; i < (this.GetRow()); i++) {
        for (int j = 0; j < (this.GetCol()); j++)
            if ((((this.Elements[i][j]) != 1) && (i == j)) || ((this.Elements[i][j]) != 0))
                return false;
            
        
    }
    return true;
}