public static de.entwicklerpages.java.schoolgame.game.SaveData[] getAll(de.entwicklerpages.java.schoolgame.SchoolGame game) {
    java.util.ArrayList<de.entwicklerpages.java.schoolgame.game.SaveData> savedSlots = new java.util.ArrayList<de.entwicklerpages.java.schoolgame.game.SaveData>();
    for (de.entwicklerpages.java.schoolgame.game.SaveData.Slot slot : de.entwicklerpages.java.schoolgame.game.SaveData.Slot.values()) {
        savedSlots.add(new de.entwicklerpages.java.schoolgame.game.SaveData(game, slot));
    }
    return ((de.entwicklerpages.java.schoolgame.game.SaveData[]) (savedSlots.toArray()));
}