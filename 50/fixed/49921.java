public static void saveAll() throws java.io.IOException {
    if ((com.talesdev.talesz.thirst.Thirst.thirst.keySet().size()) > 0) {
        for (java.lang.String playerName : com.talesdev.talesz.thirst.Thirst.thirst.keySet()) {
            com.talesdev.talesz.thirst.Thirst.saveDataToDisk(playerName);
        }
    }
}