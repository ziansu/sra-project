private void ballHitBlock() {
    if (isLevelEnd()) {
        initializeLevel((++(level)));
    }
}