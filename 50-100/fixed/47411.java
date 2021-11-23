public void checkoutFiles(java.util.List<java.nio.file.Path> filePaths) throws org.eclipse.jgit.api.errors.GitAPIException {
    elegit.Git git = new elegit.Git(this.repo);
    elegit.CheckoutCommand checkout = git.checkout();
    for (java.nio.file.Path filePath : filePaths)
        checkout.addPath(filePath.toString());
    
    checkout.call();
    git.close();
}