public final int getDialect() {
    int _d = _getDialect();
    switch (_d) {
        case lucee.loader.engine.CFMLEngine.DIALECT_BOTH :
        case lucee.loader.engine.CFMLEngine.DIALECT_CFML :
        case lucee.loader.engine.CFMLEngine.DIALECT_LUCEE :
            return _d;
        default :
            return lucee.loader.engine.CFMLEngine.DIALECT_LUCEE;
    }
}