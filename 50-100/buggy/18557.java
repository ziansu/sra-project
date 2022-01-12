private boolean isGeneralArgument(final com.forgerock.opendj.cli.Argument arg) {
    boolean general = false;
    if (arg != null) {
        final java.lang.String longId = arg.getLongIdentifier();
        general = (com.forgerock.opendj.cli.OPTION_LONG_HELP.equals(longId)) || (com.forgerock.opendj.cli.OPTION_LONG_PRODUCT_VERSION.equals(longId));
    }
    return general;
}