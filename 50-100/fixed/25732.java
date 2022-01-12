private final int level0resolve(final de.uni_freiburg.informatik.ultimate.smtinterpol.dpll.Literal l, final java.util.Set<de.uni_freiburg.informatik.ultimate.smtinterpol.dpll.Literal> level0Ants, final int sl) {
    final de.uni_freiburg.informatik.ultimate.smtinterpol.dpll.Clause l0 = getLevel0(l.negate());
    level0Ants.add(l.negate());
    return (l0.mStacklevel) > sl ? l0.mStacklevel : sl;
}