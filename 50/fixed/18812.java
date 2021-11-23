public static void closeAdventure() {
    if ((shandalike.Model.adventure) == null)
        return ;
    
    shandalike.Model.activeDuel = null;
    shandalike.Model.setActiveAdventure(null);
}