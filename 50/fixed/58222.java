public void closeBranch() {
    branching = false;
    if ((branch) != null) {
        branch.close();
    }
    branch = null;
}