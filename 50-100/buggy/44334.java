private void tryToFireEvent(com.crawljax.core.state.StateVertex targetState, com.crawljax.core.state.StateVertex curState, com.crawljax.core.state.Eventable clickable) {
    if (fireEvent(clickable)) {
        if (crawlerLeftDomain()) {
            throw new com.crawljax.core.StateUnreachableException(targetState, "Domain left while following path");
        }
        int depth = crawlDepth.incrementAndGet();
        com.crawljax.core.Crawler.LOG.info("Crawl depth is now {}", depth);
        plugins.runOnRevisitStatePlugins(context, curState);
    }else {
        throw new com.crawljax.core.StateUnreachableException(targetState, ("couldn't fire eventable " + clickable));
    }
}