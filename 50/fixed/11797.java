public static java.util.ArrayList<org.md2k.datakitapi.source.datasource.DataSource> read() throws java.io.FileNotFoundException {
    return org.md2k.utilities.Files.readJSONArray(org.md2k.autosense.Configuration.CONFIG_DIRECTORY, org.md2k.autosense.Configuration.CONFIG_FILENAME, org.md2k.datakitapi.source.datasource.DataSource.class);
}