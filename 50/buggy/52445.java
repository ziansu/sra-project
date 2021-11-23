public static void main(java.lang.String[] args) {
    data.downloaders.bitcoincharts.BitcoinChartsDownloader.downloadArchive(BitcoinChartsConstants.FILE_TICK_HISTORY_KRAKEN_BTC_EUR);
    data.Converter.processTickDataIntoBars("krakenBTCEUR", BAR_SIZE.BAR_15M);
}