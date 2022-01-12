private static com.aaronpmaus.jProt.io.Atom constructAtom(com.aaronpmaus.jProt.io.PDBFileIO.AtomRecord rec) {
    return new com.aaronpmaus.jProt.io.Atom(rec.getAtomName(), rec.getSerial(), rec.getOccupancy(), rec.getTempFactor(), rec.getCharge(), rec.getX(), rec.getY(), rec.getZ());
}