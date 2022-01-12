private void checkSameMethod(com.redhat.ceylon.compiler.typechecker.tree.Tree.Declaration that, com.redhat.ceylon.compiler.typechecker.model.Method dec, com.redhat.ceylon.compiler.typechecker.model.Method abstraction) {
    if (!(dec.getType().isExactly(abstraction.getType()))) {
        that.addError(("native methods do not have the same return type: " + (com.redhat.ceylon.compiler.typechecker.analyzer.Util.message(dec))));
    }
    checkRefiningMemberParameters(that, dec, abstraction, dec.getReference(), abstraction.getReference());
    checkRefiningMemberTypeParameters(that, dec, dec.getTypeParameters(), abstraction.getTypeParameters());
}