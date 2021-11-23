private void postAPISafe(final java.lang.String accesslink, final java.lang.String postdata) throws java.lang.Exception {
    postPage(accesslink, postdata);
    updatestatuscode();
    handleAPIErrors(br);
}