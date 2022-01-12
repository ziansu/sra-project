public void link(java.lang.String resultDirectory, java.lang.String specDirectory) throws java.lang.Exception {
    java.io.File root = createRootIndexIfNecessary(specDirectory, uk.co.codemonkey.concordion.specLinker.SpecLinker.ROOT_INDEX);
    uk.co.codemonkey.concordion.specLinker.DirectoryWalker walker = new uk.co.codemonkey.concordion.specLinker.DirectoryWalker();
    uk.co.codemonkey.concordion.specLinker.LinkCollector collector = new uk.co.codemonkey.concordion.specLinker.LinkCollector(root);
    walker.processDirectory(specDirectory, collector);
    uk.co.codemonkey.concordion.specLinker.JunitResults junitResults = new uk.co.codemonkey.concordion.specLinker.JunitResults(resultDirectory, specDirectory);
    uk.co.codemonkey.concordion.specLinker.LinkWriter writer = new uk.co.codemonkey.concordion.specLinker.LinkWriter(junitResults);
    writer.addLinks(collector.getFiles());
}