org.parboiled.Rule TimeBody() {
    return Sequence(IntLiteralOfN(2), ":", IntLiteralOfN(2), FirstOf(Sequence(":", IntLiteralOfN(2)), TestNot(Sequence(":", IntLiteralOfN(2)), push(new model.language.ConstantNode<model.language.IntValue>(new model.language.IntValue(0))))));
}