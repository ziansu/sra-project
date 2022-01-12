@java.lang.Override
public ca.uqac.lif.json.JsonElement doOperation(ca.uqac.lif.json.JsonMap argument, ca.uqac.lif.cornipickle.Interpreter i) {
    java.util.List<ca.uqac.lif.bullwinkle.TokenString> rules = i.getParser().m_parser.getAlternatives(((ca.uqac.lif.json.JsonString) (argument.get("rule"))).stringValue());
    ca.uqac.lif.json.JsonMap map = new ca.uqac.lif.json.JsonMap();
    ca.uqac.lif.json.JsonList json = new ca.uqac.lif.json.JsonList();
    for (ca.uqac.lif.bullwinkle.TokenString tok : rules) {
        json.add(new ca.uqac.lif.json.JsonString(tok.toString()));
    }
    map.put("alternatives", json);
    return map;
}