void popBacktrackLiteral(de.uni_freiburg.informatik.ultimate.smtinterpol.dpll.Literal l) {
    de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.partialmodel.DecideStackLiteralMarker marker = mLiteralToMarker.remove(l);
    if ((marker.mIndex) >= (mStack.size())) {
        return ;
    }
    java.util.List<de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.partialmodel.DecideStackEntry> suffix = mStack.subList(marker.mIndex, mStack.size());
    for (de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.partialmodel.DecideStackEntry dse : suffix) {
        if (dse instanceof de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.partialmodel.DecideStackLiteral) {
            ((de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.partialmodel.DecideStackLiteral) (dse)).unregister();
        }
    }
    suffix.clear();
    updateInternalFields();
}