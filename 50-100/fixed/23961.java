private java.util.Map<com.romelus_borucki.common.utils.WumpusBoardHelper.PieceType, com.romelus_borucki.common.utils.WumpusBoardHelper.PieceType> assumeTypes(final java.util.Set<com.romelus_borucki.common.utils.WumpusBoardHelper.PieceType> types) {
    final java.util.Map<com.romelus_borucki.common.utils.WumpusBoardHelper.PieceType, com.romelus_borucki.common.utils.WumpusBoardHelper.PieceType> retVal = new java.util.HashMap(types.size());
    for (final com.romelus_borucki.common.utils.WumpusBoardHelper.PieceType type : types) {
        switch (type) {
            case QPit :
                retVal.put(type, PieceType.Pit);
                break;
            case QWump :
                retVal.put(type, PieceType.Wumpus);
                break;
        }
    }
    return retVal;
}