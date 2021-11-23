public hudson.util.FormValidation doCheckAwsRegion(@org.kohsuke.stapler.QueryParameter(value = "awsRegion")
final java.lang.String awsRegion) {
    if (((shouldPublishToAwsSnsQueue) == null) || (shouldPublishToAwsSnsQueue)) {
        if (awsRegion == null) {
            return hudson.util.FormValidation.error("AWS Region required. ");
        }
        com.amazonaws.regions.Region r = com.amazonaws.regions.RegionUtils.getRegion(awsRegion);
        if ((r == null) || (!(r.isServiceSupported("sns")))) {
            return hudson.util.FormValidation.error("Please enter a valid SNS AWS region. ");
        }
    }
    return hudson.util.FormValidation.ok();
}