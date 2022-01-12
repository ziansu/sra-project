public java.lang.String getAnnotatedHTML() {
    java.lang.String html = new java.lang.String(text);
    java.lang.String tagged;
    for (org.openmrs.module.bannerprototype.SofaTextMention m : sofaTextMention) {
        tagged = wrapInMentionTypeTag(m.getMentionText(), m.getMentionType());
        if (!(m.getSofaTextMentionConcept().isEmpty()))
            tagged = wrapInConceptTag(tagged, m);
        
        html = html.replace(m.getMentionText(), tagged);
        html = html.replaceAll("\\n", "<br/>");
    }
    return html;
}