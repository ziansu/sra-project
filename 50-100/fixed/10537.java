private void captureTerritory(gottesman.risk.Player activePlayer, gottesman.risk.Territory selectedTerritory, gottesman.risk.map.TerritoryView territoryView, gottesman.risk.Territory territory) {
    int battalionNum = java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Enter the amount of battalions you would like to move."));
    if (battalionNum >= (selectedTerritory.getBattalions())) {
        javax.swing.JOptionPane.showMessageDialog(selectedTerritoryView, "Cannot move this amount of battalions. Try again.");
        return ;
    }else {
        territory.occupy(activePlayer);
        selectedTerritory.moveBattalionsTo(territory, battalionNum);
    }
    selectedTerritoryView.repaint();
    territoryView.repaint();
    selectTerritory(territoryView);
}