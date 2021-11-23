public boolean existe(fr.n7.stl.block.ast.impl.InterfaceImpl.Signature sign, java.util.LinkedList<fr.n7.stl.block.ast.impl.MethodImpl> methodes) {
    for (fr.n7.stl.block.ast.impl.MethodImpl meth : methodes) {
        if (((sign.getType().equals(meth.getTypeRetour())) && (sign.getNom().equals(meth.getNom()))) && (fr.n7.stl.block.ast.impl.ClasseImplementantImpl.equArg(sign.getArguments(), meth.getArguments()))) {
            return true;
        }
    }
    return false;
}