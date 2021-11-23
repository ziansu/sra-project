public boolean isValid() {
    switch (type) {
        case NORMAL :
            return (((isRealmClassValid()) && (isFieldDataValid())) && (isTransformerValid())) && (areArgsValid());
        case NO_ARG :
        case BEGIN_GROUP :
        case END_GROUP :
        case OR :
            return ((isRealmClassValid()) && (isTransformerValid())) && (areArgsValid());
        default :
            return false;
    }
}