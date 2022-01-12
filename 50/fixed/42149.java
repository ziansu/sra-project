public nz.ac.aut.ense701.gameModel.Occupant[] getOccupants() {
    if ((occupants.size()) > 0)
        return occupants.toArray(new nz.ac.aut.ense701.gameModel.Occupant[occupants.size()]);
    
    return new nz.ac.aut.ense701.gameModel.Occupant[]{  };
}