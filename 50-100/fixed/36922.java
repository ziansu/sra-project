protected JenkinsRule.WebClient getWebClient() {
    org.jvnet.hudson.test.JenkinsRule.WebClient webClient = j.createWebClient();
    webClient.setCssErrorHandler(new org.w3c.css.sac.ErrorHandler() {
        @java.lang.Override
        public void warning(org.w3c.css.sac.CSSParseException e) {
        }

        @java.lang.Override
        public void error(org.w3c.css.sac.CSSParseException e) {
        }

        @java.lang.Override
        public void fatalError(org.w3c.css.sac.CSSParseException e) {
        }
    });
    return webClient;
}