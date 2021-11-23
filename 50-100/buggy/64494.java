private void parseRule() {
    blossom.compiler.RuleParser rp = new blossom.compiler.RuleParser();
    blossom.compiler.Rule rule = rp.parse();
    position += rp.position;
    programme.addRule(rule.name, rule);
    rules.put(rule.name, rule);
}