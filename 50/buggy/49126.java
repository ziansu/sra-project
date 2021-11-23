@org.kohsuke.stapler.DataBoundSetter
public void setParserName(java.lang.String parserName) {
    if (parserName == null) {
        parserName = "HTML";
    }
    this.parserName = parserName;
    this.markupParser = org.korosoft.jenkins.plugin.rtp.pipeline.RichTextPublisherStep.DescriptorImpl.markupParsers.get(parserName);
}