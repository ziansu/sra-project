@java.lang.Override
public boolean equals(java.lang.Object toCompare) {
    if (toCompare instanceof io.magicthegathering.javasdk.resource.Card) {
        io.magicthegathering.javasdk.resource.Card cardCompare = ((io.magicthegathering.javasdk.resource.Card) (toCompare));
        return (((getMultiverseid()) == (cardCompare.getMultiverseid())) && (getName().equals(cardCompare.getName()))) && (getManaCost().equals(cardCompare.getManaCost()));
    }else {
        return false;
    }
}