public boolean EmptyArea(int AreaIndex) {
    if ((this.ListArea.get((AreaIndex - 1)).GetTrollCount()) > 0) {
        return false;
    }else
        if ((this.ListArea.get((AreaIndex - 1)).GetDemonCount()) > 0) {
            return false;
        }else
            if ((this.ListArea.get((AreaIndex - 1)).GetMinionCount(Colors.None)) < 0) {
                return false;
            }
        
    
    return true;
}