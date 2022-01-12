public void makeHeader() {
    file.writeIndent("local lpeg = require \"lpeg\"");
    nez.util.UList<nez.expr.Rule> list = peg.getDefinedRuleList();
    for (nez.expr.Rule r : list) {
        if (!(r.getLocalName().startsWith("\""))) {
            java.lang.String localName = r.getLocalName();
            file.writeIndent((((("local " + localName) + " = lpeg.V\"") + localName) + "\""));
        }
    }
}