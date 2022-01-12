public java.lang.String buildHGVSText(de.charite.compbio.jannovar.hgvs.AminoAcidCode code) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (de.charite.compbio.jannovar.annotation.Annotation anno : getAnnotations()) {
        if ((builder.length()) != 0)
            builder.append(',');
        
        if ((altCount) > 1)
            builder.append(de.charite.compbio.jannovar.impl.util.StringUtil.concatenate("alt", ((alleleID) + 1), ":"));
        
        builder.append(anno.getSymbolAndAnnotation(code));
    }
    return builder.toString();
}