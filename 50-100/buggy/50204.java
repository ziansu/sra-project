public boolean isMemberOfBroadcastList(java.lang.String nickname, java.lang.String broadcastNickname) {
    BroadcastList blist = Helper.getBroadcastListFromNickname(Config.getInstance().getCurrentUser().getBroadcastLists(), broadcastNickname);
    java.util.Iterator<java.lang.String> blistIterator = blist.getMembers().iterator();
    while (blistIterator.hasNext()) {
        java.lang.String memberNick = blistIterator.next();
        if (memberNick.equals(nickname)) {
            return true;
        }else {
            return false;
        }
    } 
    return false;
}