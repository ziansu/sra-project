public void receiveResult(final in.nickma.mortal.dtos.ResultDTO resultDTO) {
    if (resultDTO.isSuccessfull()) {
        workStack.removeAllElements();
        java.lang.String path = resultDTO.getDirections().stream().map(Direction::toString).collect(java.util.stream.Collectors.joining(","));
        java.io.InputStream inputStream = externalCommunicationHandler.getSubmissionsStream(path, resultDTO.getStartX(), resultDTO.getStartY());
        buildWorkDTOsFromInputStream(inputStream);
    }
}