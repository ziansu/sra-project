public static void load(de.eschoenawa.lanchat.GUI ui) {
    if (de.eschoenawa.lanchat.Chat.f.exists()) {
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(de.eschoenawa.lanchat.Chat.f))) {
            java.lang.String line;
            while ((line = br.readLine()) != null) {
                ui.println(line);
            } 
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}