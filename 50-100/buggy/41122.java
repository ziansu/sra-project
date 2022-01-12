@java.lang.Override
protected void createAllocation(long[] args) {
    int i = 0;
    uk.ac.man.cs.llvm.ir.types.Type type = types.get(args[0]);
    i++;
    int count = getIndexV0(args[(i++)]);
    int align = getAlign(args[(i++)]);
    code.createAllocation(type, count, align);
    symbols.add(type);
}