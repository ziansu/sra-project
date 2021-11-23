public org.m2latex.mojo.Settings setTexCommandArgs(java.lang.String args) {
    this.texCommandArgs = args.replace("( \n)+", " ").trim();
    return this;
}