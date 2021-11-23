public ie.corballis.sox.Sox outputFile(java.lang.String outputFile) throws ie.corballis.sox.WrongParametersException {
    if (!(inputFileSet)) {
        throw new ie.corballis.sox.WrongParametersException("The output file has to be later then an input file");
    }
    arguments.add(outputFile);
    outputFileSet = true;
    return this;
}