tpe.del.grp7.ub1.a3.Betrag subtrahiere(tpe.del.grp7.ub1.a3.Betrag b) {
    if (b == null) {
        return addiere(null);
    }
    return addiere(new tpe.del.grp7.ub1.a3.Betrag((-(b.getBetrag())), b.getWaehrung()));
}