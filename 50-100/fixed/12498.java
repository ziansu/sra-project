public java.lang.String fetchOrgFileString(java.lang.String orgPath) throws com.matburt.mobileorg.Error.ReportableError {
    java.io.BufferedReader reader = this.fetchOrgFile(orgPath);
    if (reader == null) {
        return "";
    }
    java.lang.String fileContents = "";
    java.lang.String thisLine = "";
    try {
        while ((thisLine = reader.readLine()) != null) {
            fileContents += thisLine + "\n";
        } 
    } catch (java.io.IOException e) {
        throw new com.matburt.mobileorg.Error.ReportableError(r.getString(R.string.error_file_read, orgPath), e);
    }
    return fileContents;
}