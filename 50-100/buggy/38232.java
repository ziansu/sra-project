@java.lang.Override
public boolean equals(java.lang.Object toCompare) {
    if (toCompare instanceof io.magicthegathering.javasdk.resource.Card) {
        io.magicthegathering.javasdk.resource.Card cardCompare = ((io.magicthegathering.javasdk.resource.Card) (toCompare));
        if ((getMultiverseid()) != (cardCompare.getMultiverseid()))
            return false;
        
        if (!(getName().equals(cardCompare.getName())))
            return false;
        
        if (!(getManaCost().equals(cardCompare.getManaCost())))
            return false;
        
        return true;
    }else {
        return false;
    }
}