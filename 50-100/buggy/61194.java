public void setCastleDetails(chessPieces.CastleDetails castleDetails) {
    if (castleDetails == (chessPieces.CastleDetails.CASTLE_BOTH)) {
        noCheckNear = true;
        noCheckFar = true;
    }else {
        if (castleDetails == (chessPieces.CastleDetails.CASTLE_FAR)) {
            noCheckFar = true;
        }else {
            noCheckFar = false;
        }
        if (castleDetails == (chessPieces.CastleDetails.CASTLE_NEAR)) {
            noCheckNear = true;
        }else {
            noCheckNear = false;
        }
    }
}