public wirefront.EngagementPage verifyFieldPresent(wirefront.enums.LinkageField field, boolean present) {
    wirefront.Assertions.verify(common.WireBrowser.Instance(), wirefront.EngagementPage.targetLinkageField(field), present);
    return this;
}