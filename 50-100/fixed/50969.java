public static boolean checkWin(com.williamgrand.tictactoe.Player p) {
    if (com.williamgrand.tictactoe.GameManager.checkVerticalWin(p))
        return true;
    else
        if (com.williamgrand.tictactoe.GameManager.checkHorizontalWin(p))
            return true;
        else
            if (com.williamgrand.tictactoe.GameManager.checkDiagonalWin(p))
                return true;
            else
                if (com.williamgrand.tictactoe.GameManager.checkFourCornersWin(p))
                    return true;
                else
                    if (com.williamgrand.tictactoe.GameManager.checkBlobWin(p))
                        return true;
                    else
                        return false;
                    
                
            
        
    
}