private pwrrgmp2017.go.game.Model.GameBoard.Field checkIfAreaIsTerritoryRecursive(int i, int j) {
    switch (boardReturn[i][j]) {
        case BLACKSTONE :
        case DEADWHITE :
            return pwrrgmp2017.go.game.Model.GameBoard.Field.BLACKSTONE;
        case WHITESTONE :
        case DEADBLACK :
            return pwrrgmp2017.go.game.Model.GameBoard.Field.WHITESTONE;
        case EMPTY :
            if ((chain[(i - 1)][(j - 1)]) == true)
                return pwrrgmp2017.go.game.Model.GameBoard.Field.EMPTY;
            else
                return checkIfAreaIsTerritory(i, j);
            
        case WALL :
            return pwrrgmp2017.go.game.Model.GameBoard.Field.EMPTY;
        default :
            return pwrrgmp2017.go.game.Model.GameBoard.Field.EMPTY;
    }
}