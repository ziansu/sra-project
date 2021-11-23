private void followLink(java.lang.StringBuilder graphText, org.springframework.xd.dirt.job.dsl.Link link, org.springframework.xd.dirt.job.dsl.Node nodeToFinishFollowingAt, java.util.List<org.springframework.xd.dirt.job.dsl.Node> unvisitedNodes, java.util.List<org.springframework.xd.dirt.job.dsl.Link> unfollowedLinks) {
    unfollowedLinks.remove(link);
    org.springframework.xd.dirt.job.dsl.Node target = findNodeById(link.to);
    printNode(graphText, target, unvisitedNodes);
    java.util.List<org.springframework.xd.dirt.job.dsl.Link> toFollow = findLinksFrom(target, false);
    printTransitions(graphText, unvisitedNodes, unfollowedLinks, toFollow, nodeToFinishFollowingAt);
    followLinks(graphText, toFollow, nodeToFinishFollowingAt, unvisitedNodes, unfollowedLinks);
}