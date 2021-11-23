public static java.io.FileReader download(java.lang.String fileName, com.amazon.proposalcalculator.enums.ProductName productName) throws java.io.IOException {
    com.amazon.proposalcalculator.reader.PriceListDownloader.LOGGER.info(java.lang.String.format("Downloading price list for %s. This might take a while...", productName));
    java.net.URL website = new java.net.URL(java.lang.String.format(com.amazon.proposalcalculator.reader.PriceListDownloader.URL_PRICE_LIST, productName));
    java.io.File file = new java.io.File(fileName);
    org.apache.commons.io.FileUtils.copyURLToFile(website, file, com.amazon.proposalcalculator.reader.PriceListDownloader.CONNECTION_TIMEOUT, com.amazon.proposalcalculator.reader.PriceListDownloader.READ_TIMEOUT);
    com.amazon.proposalcalculator.reader.PriceListDownloader.LOGGER.info(java.lang.String.format("Price list for %s downloaded.", productName));
    return new java.io.FileReader(file);
}