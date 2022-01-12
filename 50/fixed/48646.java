public void setBrickHealth(int clickPower) {
    if (clickPower > (currentBrickHealth)) {
        brickHits += currentBrickHealth;
        currentBrickHealth -= clickPower;
    }else {
        brickHits += clickPower;
        currentBrickHealth -= clickPower;
    }
    setBrickButton();
}