public void align(org.biojava.nbio.structure.Structure s, java.util.List<org.biojava.nbio.structure.Chain> seqResList) {
    java.util.List<org.biojava.nbio.structure.Chain> atomList = s.getModel(0);
    for (org.biojava.nbio.structure.Chain seqRes : seqResList) {
        org.biojava.nbio.structure.Chain atomRes = org.biojava.nbio.structure.io.SeqRes2AtomAligner.getMatchingAtomRes(seqRes, atomList);
        if (atomRes == null)
            continue;
        
        mapSeqresRecords(atomRes, seqRes);
    }
}