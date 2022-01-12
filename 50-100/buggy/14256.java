protected void setIn(wyopcl.translator.bound.BasicBlock block, wyil.transforms.LiveVariablesAnalysis.Env new_in) {
    wyil.transforms.LiveVariablesAnalysis.Env in = inSet.get(block);
    if (!(in.containsAll(new_in))) {
        this.isChanged |= true;
        inSet.put(block, new_in);
    }
}