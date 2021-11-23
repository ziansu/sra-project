public java.util.List<Model.Move> getAvailableWhiteMoves() {
    if ((availableWhiteMoves) != null)
        return availableWhiteMoves;
    else
        return getAllWhiteAvailableMoves();
    
}