private int findFALusingAdapterPosition(long l) {
    try {
        java.lang.String choosenID = adapter.getItem(((int) (l))).getSteamID();
        for (int i = 0; i < (de.fosefx.steamnotificator.Main2Activity.friendArrayList.size()); i++) {
            if (de.fosefx.steamnotificator.Main2Activity.friendArrayList.get(i).equals(choosenID)) {
                return i;
            }
        }
    } catch (java.lang.Exception e) {
    }
    return 99999;
}