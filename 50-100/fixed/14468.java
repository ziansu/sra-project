@java.lang.Override
public void validate(org.sonar.plugins.jenkins.config.JobConfiguration jobConfig) {
    switch (jobConfig.getJobType()) {
        case FREESTYLE :
            org.w3c.dom.NodeList nodes = jobConfig.getConfigXml().getDocument().getElementsByTagName("assignedNode");
            if ((nodes.getLength()) > 0) {
                jobConfig.getConfigXml().createViolation(getRuleKey(), 1, "Every job should be assigned to a node or label.");
            }
            break;
        case PIPELINE :
            break;
        case MB_PIPELINE :
            break;
        default :
            break;
    }
}