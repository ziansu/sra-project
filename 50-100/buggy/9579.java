public java.lang.String toVCFAnnoString(java.lang.String alt, boolean escape) {
    de.charite.compbio.jannovar.annotation.VCFAnnotationData data = new de.charite.compbio.jannovar.annotation.VCFAnnotationData();
    data.effects = effects;
    data.impact = getPutativeImpact();
    data.setTranscriptAndChange(transcript, change);
    data.setAnnoLoc(annoLoc);
    data.isCoding = transcript.isCoding();
    data.cdsNTChange = cdsNTChange;
    data.proteinChange = proteinChange;
    data.messages = messages;
    if (escape)
        return data.toString(alt);
    else
        return data.toUnescapedString(alt);
    
}