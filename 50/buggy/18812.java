public static void closeAdventure() {
    if ((shandalike.Model.adventure) == null)
        return ;
    
    shandalike.Model.adventure.save(0);
    shandalike.Model.adventures.put(shandalike.Model.adventure.getName(), shandalike.Model.adventure);
    shandalike.Model.activeDuel = null;
    shandalike.Model.setActiveAdventure(null);
}