public static int getExperienceForNextLevel(int currentLevel) {
    if (currentLevel < 16) {
        return (2 * currentLevel) + 7;
    }else
        if (currentLevel < 31) {
            return (5 * currentLevel) - 38;
        }else {
            return (9 * currentLevel) - 158;
        }
    
}