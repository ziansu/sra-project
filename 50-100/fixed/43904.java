public boolean linkTower(VOR.VORTower tower, int frequency) {
    if (frequency == (tower.getFrequency())) {
        linkedfrequency = tower.getFrequency();
        java.lang.System.out.println((("Tower Linked on frequency: " + (linkedfrequency)) + "\n"));
        return true;
    }else {
        return false;
    }
}