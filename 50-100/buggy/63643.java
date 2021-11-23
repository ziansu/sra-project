public java.util.List<java.lang.String> findEstimateNumbersForAbstractEstimate(final java.lang.String name) {
    java.util.List<java.lang.String> lineEstimateNumbers = new java.util.ArrayList<java.lang.String>();
    lineEstimateNumbers = lineEstimateDetailsRepository.findEstimateNumbersForLoa((("%" + name) + "%"), LineEstimateStatus.TECHNICAL_SANCTIONED.toString(), WorksConstants.CANCELLED_STATUS);
    lineEstimateNumbers.addAll(lineEstimateDetailsRepository.findEstimateNumbersForAbstractEstimate((("%" + name) + "%"), LineEstimateStatus.ADMINISTRATIVE_SANCTIONED.toString(), WorksConstants.CANCELLED_STATUS));
    return lineEstimateNumbers;
}