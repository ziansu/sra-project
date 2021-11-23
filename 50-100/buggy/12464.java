public java.lang.String loadSettingsFile(nfl.season.input.NFLTeamSettingsFileReaderFactory fileReaderFactory) throws java.io.IOException {
    java.io.BufferedReader fileReader = fileReaderFactory.createNFLTeamSettingsReader();
    java.lang.StringBuilder nflTeamSettingsBuilder = new java.lang.StringBuilder();
    java.lang.String line = fileReader.readLine();
    while (line != null) {
        nflTeamSettingsBuilder.append(line);
        nflTeamSettingsBuilder.append("\n");
        line = fileReader.readLine();
    } 
    fileReader.close();
    return nflTeamSettingsBuilder.toString();
}