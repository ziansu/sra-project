private static int firstHighPriority(West.Math.Set.Collection<West.Math.Set.Node.TokenNode> peles) {
    int pos = 0;
    int priority = West.Math.Equation.Function.Function.DEFAULT_PRIORITY;
    for (int i = 0; i < (peles.size()); i++) {
        if ((peles.get(i).priority()) <= priority) {
            priority = peles.get(i).priority();
            pos = i;
        }
    }
    return pos;
}