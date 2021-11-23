@java.lang.Override
public int compare(org.gots.seed.BaseSeedInterface obj1, org.gots.seed.BaseSeedInterface obj2) {
    int result = 0;
    if ((((obj1 != null) && (obj2 != null)) && ((obj1.getSpecie()) != null)) && ((obj2.getSpecie()) != null)) {
        result = org.gots.seed.SeedUtil.translateSpecie(mcontext, obj1).compareTo(org.gots.seed.SeedUtil.translateSpecie(mcontext, obj2));
    }
    return result;
}