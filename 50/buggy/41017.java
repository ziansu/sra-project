public void removeLevel() {
    if ((currentLevel) < 0)
        return ;
    
    levels.remove(currentLevel);
    (currentLevel)--;
}