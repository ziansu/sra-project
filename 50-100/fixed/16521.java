protected void setOut(wyopcl.translator.bound.BasicBlock block, wyil.transforms.LiveVariablesAnalysis.Env new_out) {
    wyil.transforms.LiveVariablesAnalysis.Env out = outSet.get(block);
    if (!(out.equals(new_out))) {
        this.isChanged |= true;
        outSet.put(block, new_out);
    }
}