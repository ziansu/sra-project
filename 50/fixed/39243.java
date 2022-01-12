public components.Space getSpace(definitions.Rank rank, definitions.File file) {
    if ((rank == null) || (file == null))
        return null;
    
    return spaces[rank.ordinal()][file.ordinal()];
}