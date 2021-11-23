protected void deserializeScopes(java.io.DataInput input) throws java.io.IOException {
    int length = input.readInt();
    for (int i = 0; i < length; i++) {
        scopes.add(((com.besuikerd.autologistics.common.lib.dsl.vm.stackvalue.ClosureValue) (com.besuikerd.autologistics.common.lib.dsl.vm.stackvalue.visitor.DataInputStackValueParser.parse(input))));
    }
}