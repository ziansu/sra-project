private static boolean isParentOf(wyal.lang.SyntacticItem parent, wyal.lang.WyalFile.Expr child) {
    if (parent.equals(child)) {
        return true;
    }else {
        for (int i = 0; i != (parent.size()); ++i) {
            wyal.lang.SyntacticItem pChild = parent.getOperand(i);
            if ((pChild != null) && (wytp.proof.rules.CongruenceClosure.isParentOf(pChild, child))) {
                return true;
            }
        }
        return false;
    }
}