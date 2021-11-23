public void setCastleDetails(chessPieces.CastleDetails castleDetails) {
    noCheckNear = false;
    noCheckFar = false;
    if (castleDetails == (chessPieces.CastleDetails.CASTLE_BOTH)) {
        noCheckNear = true;
        noCheckFar = true;
    }else {
        if (castleDetails == (chessPieces.CastleDetails.CASTLE_FAR)) {
            noCheckFar = true;
        }
        if (castleDetails == (chessPieces.CastleDetails.CASTLE_NEAR)) {
            noCheckNear = true;
        }
    }
}