public com.mesosphere.sdk.offer.evaluate.placement.PlacementRule run(java.lang.String podName, java.lang.String fieldName, java.lang.String operatorName, java.util.Optional<java.lang.String> ignoredParameter) {
    com.mesosphere.sdk.offer.evaluate.placement.StringMatcher taskFilter = com.mesosphere.sdk.offer.evaluate.placement.RegexMatcher.create((podName + "-.*"));
    if (com.mesosphere.sdk.offer.evaluate.placement.MarathonConstraintParser.isHostname(fieldName)) {
        return new com.mesosphere.sdk.offer.evaluate.placement.MaxPerHostnameRule(1, taskFilter);
    }else {
        com.mesosphere.sdk.offer.evaluate.placement.StringMatcher matcher = com.mesosphere.sdk.offer.evaluate.placement.RegexMatcher.createAttribute(fieldName, ".*");
        return new com.mesosphere.sdk.offer.evaluate.placement.AndRule(com.mesosphere.sdk.offer.evaluate.placement.AttributeRule.require(matcher), new com.mesosphere.sdk.offer.evaluate.placement.MaxPerAttributeRule(1, matcher, taskFilter));
    }
}