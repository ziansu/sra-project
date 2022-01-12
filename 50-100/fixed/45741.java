public static org.casestudy.target.chess.constants.PieceType decode(java.lang.String shortName) {
    if ((shortName == null) || (shortName.equals(""))) {
        return org.casestudy.target.chess.constants.PieceType.Pawn;
    }else
        if (shortName.equals("R")) {
            return org.casestudy.target.chess.constants.PieceType.Rook;
        }else
            if (shortName.equals("N")) {
                return org.casestudy.target.chess.constants.PieceType.Knight;
            }else
                if (shortName.equals("K")) {
                    return org.casestudy.target.chess.constants.PieceType.King;
                }else
                    if (shortName.equals("Q")) {
                        return org.casestudy.target.chess.constants.PieceType.Queen;
                    }else {
                        return org.casestudy.target.chess.constants.PieceType.Bishop;
                    }
                
            
        
    
}