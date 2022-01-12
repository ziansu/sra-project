private life.organisms.Organism getRandomOrganism() {
    int num = mRandom.nextInt(10);
    if (num <= 2) {
        return new life.organisms.Algae();
    }else
        if ((num == 3) && (num == 4)) {
            return new life.organisms.Fish();
        }else
            if (num == 5) {
                return new life.organisms.Shark();
            }else {
                return null;
            }
        
    
}