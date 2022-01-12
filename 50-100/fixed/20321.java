public void checkDuplicateLabel(edu.buffalo.cse.blue.maybe.ast.Expr label) throws polyglot.types.SemanticException {
    java.lang.String labelString = label.toString();
    if (edu.buffalo.cse.blue.maybe.ast.MaybeExt.labelMap.containsKey(labelString)) {
        edu.buffalo.cse.blue.maybe.ast.Expr duplicateLabel = edu.buffalo.cse.blue.maybe.ast.MaybeExt.labelMap.get(labelString);
        if (duplicateLabel != label) {
            throw new polyglot.types.SemanticException(((((("Maybe labels " + labelString) + " multiply defined. ") + "Previous definition at ") + (duplicateLabel.position())) + "."), label.position());
        }
    }
    edu.buffalo.cse.blue.maybe.ast.MaybeExt.labelMap.put(labelString, label);
}