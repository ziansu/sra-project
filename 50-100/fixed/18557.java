private boolean isGeneralArgument(final com.forgerock.opendj.cli.Argument arg) {
    if (arg != null) {
        final java.lang.String longId = arg.getLongIdentifier();
        return (com.forgerock.opendj.cli.OPTION_LONG_HELP.equals(longId)) || (com.forgerock.opendj.cli.OPTION_LONG_PRODUCT_VERSION.equals(longId));
    }
    return false;
}