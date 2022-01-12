@org.junit.Test(expected = org.dasein.cloud.OperationNotSupportedException.class)
public void authorizeDenyRuleShouldThrowException() throws org.dasein.cloud.CloudException, org.dasein.cloud.InternalException {
    java.lang.String securityGroupId = "sg-1a2b3c4d";
    org.dasein.cloud.network.FirewallRuleCreateOptions options = org.dasein.cloud.network.FirewallRuleCreateOptions.getInstance(Direction.INGRESS, Permission.DENY, org.dasein.cloud.network.RuleTarget.getCIDR(""), Protocol.TCP, org.dasein.cloud.network.RuleTarget.getGlobal(""), 8080, 8080, 100);
    securityGroup.authorize(securityGroupId, options);
}