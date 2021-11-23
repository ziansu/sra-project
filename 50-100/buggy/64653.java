public boolean setUnits() {
    try {
        for (int i = 0; i < (sandbox_client.CombatSimTab.NUM_SHIPS); i++) {
            _playerUnitCounts[i] = java.lang.Integer.parseInt(_playerUnitFields[i].getText().toString());
            _enemyUnitCounts[i] = java.lang.Integer.parseInt(_enemyUnitFields[i].getText().toString());
        }
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.out.println("Error in setUnits");
        return false;
    }
    return true;
}