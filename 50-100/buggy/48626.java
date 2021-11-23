public void AddBuilding(Pieces b) {
    if (this.HasTroubleMaker()) {
        java.lang.System.out.println("This area has a trouble marker, you cannot build a building");
    }else
        if ((this.GetMinionCount(b.GetPieceColor())) > 0) {
            if (this.IsBuilt) {
                java.lang.System.out.println("Each Area can only hold one building.This area already has one");
            }else {
                this.Building = b;
                this.IsBuilt = true;
            }
        }else {
            java.lang.System.out.println("you do not have a minion in the area, cannnot build building");
        }
    
}