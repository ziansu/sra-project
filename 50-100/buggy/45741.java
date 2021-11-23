public static org.casestudy.target.chess.constants.PieceType decode(java.lang.String shortName) {
    if ((shortName == null) || (shortName == "")) {
        return org.casestudy.target.chess.constants.PieceType.Pawn;
    }else
        if (shortName == "R") {
            return org.casestudy.target.chess.constants.PieceType.Rook;
        }else
            if (shortName == "N") {
                return org.casestudy.target.chess.constants.PieceType.Knight;
            }else
                if (shortName == "K") {
                    return org.casestudy.target.chess.constants.PieceType.King;
                }else
                    if (shortName == "Q") {
                        return org.casestudy.target.chess.constants.PieceType.Queen;
                    }else {
                        return org.casestudy.target.chess.constants.PieceType.Bishop;
                    }
                
            
        
    
}