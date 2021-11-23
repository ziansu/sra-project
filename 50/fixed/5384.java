public java.lang.String[] getSignatures() {
    return args.stream().map(Typeable::getType).toArray(java.lang.String[]::new);
}