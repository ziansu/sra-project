public void addExp(int expToAdd) {
    experience += expToAdd;
    if ((experience) < 0) {
        experience = 0;
    }
    if ((experience) >= 100) {
        while ((experience) >= 100) {
            levelUp();
            experience -= 100;
        } 
    }
}