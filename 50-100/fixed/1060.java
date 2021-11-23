@java.lang.Override
protected de.hybris.platform.util.PriceValue findBasePrice(final de.hybris.platform.core.model.order.AbstractOrderEntryModel entry) throws de.hybris.platform.order.exceptions.CalculationException {
    return getFindPriceStrategy().findBasePrice(entry).equals(new java.lang.Double(0.0)) ? new de.hybris.platform.util.PriceValue(entry.getOrder().getCurrency().toString(), 0.0, true) : getFindPriceStrategy().findBasePrice(entry);
}