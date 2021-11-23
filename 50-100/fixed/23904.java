public me.predatorray.bud.lisp.lang.BudObject execute(java.lang.CharSequence source) {
    me.predatorray.bud.lisp.lexer.Lexer lexer = new me.predatorray.bud.lisp.lexer.Lexer(source);
    me.predatorray.bud.lisp.parser.Parser parser = new me.predatorray.bud.lisp.parser.Parser();
    java.util.List<me.predatorray.bud.lisp.parser.Expression> expressions = parser.parse(lexer);
    me.predatorray.bud.lisp.lang.BudObject result = null;
    for (me.predatorray.bud.lisp.parser.Expression expression : expressions) {
        result = evaluator.evaluate(expression, initial);
    }
    return result;
}