public static void load(de.eschoenawa.lanchat.GUI ui) {
    if (de.eschoenawa.lanchat.Chat.f.exists()) {
        java.io.FileReader in;
        try {
            in = new java.io.FileReader(de.eschoenawa.lanchat.Chat.f);
            java.io.BufferedReader br = new java.io.BufferedReader(in);
            while (br.ready()) {
                ui.println(br.readLine());
            } 
            br.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}