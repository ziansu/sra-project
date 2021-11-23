public void checkValue(java.lang.String var, java.util.ArrayList<com.dischain.bnfparser.BaseGrammar.AbstractMLVariable> righthandside) {
    if (com.dischain.bnfparser.BaseGrammar.BaseGrammar.equalsByAliases(var, BaseGrammar.IS))
        return ;
    else
        if (com.dischain.bnfparser.BaseGrammar.BaseGrammar.containsValue(var)) {
            java.lang.String name = com.dischain.bnfparser.BaseGrammar.BaseGrammar.get(var).getVariable();
            com.dischain.bnfparser.BaseGrammar.NonterminalMLVariable ntmlv = new com.dischain.bnfparser.BaseGrammar.NonterminalMLVariable(name);
            righthandside.add(ntmlv);
        }else {
            righthandside.add(new com.dischain.bnfparser.BaseGrammar.NonterminalMLVariable(var));
        }
    
}