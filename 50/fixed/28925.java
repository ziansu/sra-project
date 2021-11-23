private void assembleBodyTerms() {
    this.jenaRulesBuilder.withResourceOwner(edu.uoa.cs.master.cloudmanufacturingnlp.util.Tools.removeDashSuffix(this.subject));
    assembleResourceType();
    assembleAccessConditions();
    this.jenaRule.append(this.jenaRulesBuilder.build());
}