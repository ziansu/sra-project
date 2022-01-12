protected void injectSizzleIfNeeded(org.tribbloid.spookystuff.selenium.JavascriptExecutor context) {
    if (!(sizzleLoaded(context))) {
        injectSizzle(context);
    }
}