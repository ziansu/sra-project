public java.util.List<Model.Move> getAvailableWhiteMoves() {
    if (((availableWhiteMoves) != null) && ((availableWhiteMoves.size()) > 0))
        return availableWhiteMoves;
    else
        return getAllWhiteAvailableMoves();
    
}