@java.lang.Override
public boolean setColour(me.tqvj24.michaelcroall.Piece colour) throws me.tqvj24.michaelcroall.ColourAlreadySetException, me.tqvj24.michaelcroall.InvalidColourException {
    if ((this.colour) != (Piece.UNSET))
        throw new me.tqvj24.michaelcroall.ColourAlreadySetException();
    
    if (colour == (Piece.UNSET))
        throw new me.tqvj24.michaelcroall.InvalidColourException();
    
    this.colour = colour;
    return true;
}