@java.lang.Override
public org.jenkinsci.plugins.pagerduty.PagerDutyTrigger.DescriptorImpl getDescriptor() {
    jenkins.model.Jenkins j = jenkins.model.Jenkins.getInstance();
    return j != null ? j.getDescriptorByType(org.jenkinsci.plugins.pagerduty.PagerDutyTrigger.DescriptorImpl.class) : null;
}