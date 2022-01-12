private void readFont(chatprogramm.cll.gui.data.Person user, java.lang.String friend) {
    java.awt.Font f = chatprogramm.cll.storage.Fontinfo.getFont(user, friend);
    if (f == null) {
        map_f.put(friend, chatprogramm.cll.gui.data.DataProvider.STD_FONT);
    }else {
        map_f.put(friend, chatprogramm.cll.storage.Fontinfo.getFont(user, friend));
    }
}