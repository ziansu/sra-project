private void requestLocationByTowers() {
    towerManager.setOnTowersChangedListener(new codemagnus.com.dealokav2.tower.TowerManager.TowersChangeCallback() {
        @java.lang.Override
        public void didTowersChanged(java.util.ArrayList<codemagnus.com.dealokav2.tower.Tower> towers, java.lang.Exception e) {
            displayCurrentTower();
            if (towers != null) {
                saveTowers(towers);
                towerManager.getCurrentLocationByTowers(towers, locationRequestCallback);
            }
        }
    });
}