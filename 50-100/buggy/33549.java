public java.util.ArrayList<Model.Player> getFriends(int mid) {
    java.util.ArrayList<Model.Player> temp = new java.util.ArrayList();
    for (Model.Player player : players) {
        if (((player.isCivil()) == (getPlayer(mid).isCivil())) && ((player.getId()) != mid)) {
            temp.add(player);
        }
    }
    return temp;
}