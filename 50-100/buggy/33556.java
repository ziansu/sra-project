@java.lang.Override
protected java.lang.String increaseLust() {
    switch (stance) {
        case DOGGY :
        case KNOTTED :
        case ANAL :
        case STANDING :
        case COWGIRL :
            if (perks.containsKey(Perk.WEAK_TO_ANAL.toString()))
                return increaseLust(2);
            
        case FELLATIO :
        case SIXTY_NINE :
            return increaseLust(1);
        default :
            return null;
    }
}