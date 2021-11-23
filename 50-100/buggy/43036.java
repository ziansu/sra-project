@java.lang.Override
public void execute(at.plechinger.scrapeql.query.QueryContext context) {
    at.plechinger.scrapeql.query.variable.SelectorVariable fromVariable = context.getVariable(from, at.plechinger.scrapeql.query.variable.SelectorVariable.class);
    fromVariable.execute(context);
    org.jsoup.nodes.Element fromElement = fromVariable.getElement();
    for (at.plechinger.scrapeql.query.variable.Variable var : elements) {
        if (var instanceof at.plechinger.scrapeql.query.variable.SelectorVariable) {
            at.plechinger.scrapeql.query.variable.SelectorVariable s = ((at.plechinger.scrapeql.query.variable.SelectorVariable) (var));
            s.setRoot(fromElement);
        }
        var.execute(context);
    }
}