private boolean eval(cc.sferalabs.sfera.scripts.parser.antlr.SferaScriptGrammarParser.EventContext ctx, cc.sferalabs.sfera.events.Event event) throws java.lang.Exception {
    if ((ctx.stableEvent()) != null) {
        return eval(ctx.stableEvent(), event);
    }else {
        return eval(ctx.transientEvent(), event);
    }
}