public me.predatorray.bud.lisp.lang.BudObject execute(java.lang.CharSequence source) {
    me.predatorray.bud.lisp.lexer.Lexer lexer = new me.predatorray.bud.lisp.lexer.Lexer(source);
    me.predatorray.bud.lisp.parser.Parser parser = new me.predatorray.bud.lisp.parser.Parser();
    java.util.List<me.predatorray.bud.lisp.parser.Expression> expressions = parser.parse(lexer);
    if ((expressions.size()) == 1) {
        me.predatorray.bud.lisp.parser.Expression expression = expressions.get(0);
        return evaluator.evaluate(expression, initial);
    }else {
        throw new java.lang.UnsupportedOperationException();
    }
}