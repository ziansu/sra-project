@java.lang.Override
public java.util.List<de.blackcraze.grb.model.entity.StockType> findByNameLike(java.lang.String name, java.util.Locale locale) {
    java.util.List<de.blackcraze.grb.model.entity.StockType> stocks = de.blackcraze.grb.util.InjectorUtils.getStockTypeDao().findAll();
    java.util.function.Predicate<de.blackcraze.grb.model.entity.StockType> filter = ( stock) -> !(de.blackcraze.grb.i18n.Resource.getItem(stock.getName(), locale).toLowerCase().contains(name.toLowerCase()));
    stocks.removeIf(filter);
    return stocks;
}