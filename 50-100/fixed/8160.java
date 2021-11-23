private void addOptionWithArg(org.apache.commons.cli.Options options, java.lang.String longOptionName, java.util.Optional<java.lang.String> shortOptionName, boolean required, java.lang.String description) {
    if (isChangable(longOptionName)) {
        options.addOption(org.apache.commons.cli.Option.builder(shortOptionName.orElse(null)).longOpt(longOptionName).hasArg().required(required).desc(description).build());
    }
}