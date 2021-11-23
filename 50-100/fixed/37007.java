public static void addEvents(java.util.ArrayList<dachman.lucas.letsgoapp2.Models.Event> list, dachman.lucas.letsgoapp2.Models.Category category, android.content.Context context) {
    dachman.lucas.letsgoapp2.EventGenerator eg = dachman.lucas.letsgoapp2.EventGenerator.getInstance(context);
    java.util.ArrayList<dachman.lucas.letsgoapp2.Models.Event> tempEvents = eg.getEvents();
    for (dachman.lucas.letsgoapp2.Models.Event e : tempEvents) {
        if ((e.getCategory()) == category) {
            list.add(e);
        }
    }
}