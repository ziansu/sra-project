private int selectivity(uk.me.parabola.mkgmap.osmstyle.eval.Op op) {
    switch (op.getType()) {
        case EQUALS :
            return 0;
        case EXISTS :
            return 100;
        case NOT_EQUALS :
        case NOT_EXISTS :
        case NOT :
        case NOT_REGEX :
            return 1000;
        case AND :
            return 500;
        case OR :
            return 501;
        case REGEX :
            return 201;
        default :
            if (!(uk.me.parabola.mkgmap.osmstyle.ExpressionArranger.isIndexable(op)))
                return 1000;
            
            return 200;
    }
}