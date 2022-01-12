public boolean AddBuilding(Pieces b) {
    if (this.HasTroubleMaker()) {
        java.lang.System.out.println("This area has a trouble marker, you cannot build a building");
        return false;
    }else
        if ((this.GetMinionCount(b.GetPieceColor())) > 0) {
            if (this.IsBuilt) {
                java.lang.System.out.println("Each Area can only hold one building.This area already has one");
                return false;
            }else {
                this.Building = b;
                this.IsBuilt = true;
                return true;
            }
        }else {
            java.lang.System.out.println("you do not have a minion in the area, cannnot build building");
            return false;
        }
    
}