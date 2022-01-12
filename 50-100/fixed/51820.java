public boolean vaginallyPenetratedBy(java.lang.Character self, java.lang.Character other) {
    if (other != (getOther(self))) {
        return false;
    }
    nightgames.characters.body.BodyPart part = partFor(self);
    nightgames.characters.body.BodyPart otherPart = partFor(other);
    return (((part != null) && (part.isType("pussy"))) && (otherPart != null)) && (!(otherPart.isType("pussy")));
}