private static boolean isParentOf(wyal.lang.WyalFile.Expr parent, wyal.lang.WyalFile.Expr child) {
    if (parent.equals(child)) {
        return true;
    }else {
        for (int i = 0; i != (parent.size()); ++i) {
            wyal.lang.SyntacticItem pChild = parent.getOperand(i);
            if ((pChild instanceof wyal.lang.WyalFile.Expr) && (wytp.proof.rules.CongruenceClosure.isParentOf(((wyal.lang.WyalFile.Expr) (pChild)), child))) {
                return true;
            }
        }
        return false;
    }
}