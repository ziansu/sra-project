public java.lang.String getState() {
    final VASSAL.tools.SequenceEncoder se = new VASSAL.tools.SequenceEncoder(',');
    se.append(owner).append(label).append(nRed).append(nBlack).append(showing);
    return se.getValue();
}