private static edu.scripps.yates.dtaselectparser.DTASelectParser getDTASelectParser(edu.scripps.yates.pcq.ProteinClusterQuantParameters params) throws java.io.FileNotFoundException {
    if (((params.getIdentificationInputFileNamesArray()) != null) && ((params.getIdentificationInputFileNamesArray().length) > 0)) {
        return edu.scripps.yates.pcq.util.PCQUtils.getDTASelectParser(params, params.getIdentificationInputFileNamesArray());
    }
    return null;
}