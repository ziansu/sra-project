public void removeLevel() {
    if ((currentLevel) < 0)
        return ;
    
    levels.remove(levels.get(currentLevel));
    (currentLevel)--;
}