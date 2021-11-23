@java.lang.Override
public void endDocument() throws org.xml.sax.SAXException {
    super.endDocument();
    currentTariff.setOperator(operator);
    currentTariff.setCallPrices(callPrices);
    currentTariff.setSmsPrices(smsPrices);
    currentTariff.setParameters(parameters);
    tariffs.add(currentTariff);
}