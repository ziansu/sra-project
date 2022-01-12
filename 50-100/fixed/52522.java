protected net.vexelon.currencybg.app.db.models.CurrencyData getBGNCurrency() {
    net.vexelon.currencybg.app.db.models.CurrencyData currency = new net.vexelon.currencybg.app.db.models.CurrencyData();
    currency.setCode("BGN");
    currency.setRatio(1);
    currency.setBuy("1");
    currency.setSell("1");
    currency.setSource(0);
    currency.setDate(org.joda.time.LocalDate.now().toString());
    return currency;
}