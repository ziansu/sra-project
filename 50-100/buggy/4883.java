static boolean checkAminoAcidsFromPosition(java.lang.String sequence, int pos, java.lang.String aas) {
    boolean insertionMode = (aas == null) || (aas.isEmpty());
    if (insertionMode)
        return com.nextprot.api.isoform.mapper.utils.SequencePositionMapper.checkSequencePosition(sequence, pos, true);
    
    return (com.nextprot.api.isoform.mapper.utils.SequencePositionMapper.checkSequencePosition(sequence, pos, false)) && ((sequence.indexOf(aas)) == (pos - 1));
}