@java.lang.Override
protected java.lang.String increaseLust() {
    switch (stance) {
        case DOGGY :
        case KNOTTED :
        case ANAL :
        case STANDING :
        case COWGIRL :
            if ((perks.get(Perk.WEAK_TO_ANAL.toString(), 0)) > 0)
                return increaseLust(2);
            
        case FELLATIO :
        case SIXTY_NINE :
            return increaseLust(1);
        default :
            return null;
    }
}