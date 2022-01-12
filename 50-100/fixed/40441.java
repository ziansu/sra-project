public void update() {
    super.update();
    if ((myWeapons) != null) {
        for (int i = 0; i < (myWeapons.length); i++) {
            if ((myWeapons[i].sinceDelay) > 0)
                (myWeapons[i].sinceDelay)--;
            
        }
    }
}