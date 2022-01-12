public java.util.Collection<org.tapchain.editor.IActorTap> searchRoomPieces(org.tapchain.core.IPoint iPoint, org.tapchain.core.IPiece... exclusive) {
    java.util.Collection<org.tapchain.editor.IActorTap> tList = getTaps(iPoint);
    if ((tList == null) || ((tList.size()) <= 0))
        return null;
    
    tList.removeAll(java.util.Arrays.asList(exclusive));
    return tList;
}