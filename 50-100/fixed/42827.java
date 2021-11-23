public java.lang.String pricePerGood(net.sf.freecol.common.model.Market lookup) {
    int total = 0;
    if ((lookup != null) && ((goods) != null)) {
        total = lookup.getBidPrice(goods.getType(), goods.getAmount());
    }
    net.sf.freecol.common.model.StringTemplate template = net.sf.freecol.common.model.StringTemplate.template("captureGoodsDialog.totalvalue").addAmount("%total%", total);
    java.lang.System.out.println(net.sf.freecol.common.i18n.Messages.message(template));
    return net.sf.freecol.common.i18n.Messages.message(template);
}