private static void launchMarketService(utils.proxy.AuthenticatePolicy.Client clientId) {
    final data.dao.market.MarketDaoProxy marketDao = data.dao.market.MarketDaoProxy.getInstance();
    final service.query.OrderQueryService order = service.impl.query.OrderQueryManager.getInstance();
    final service.member.MemberCreditService creditService = service.impl.member.MemberCreditManager.getInstance();
    service.market.MarketServiceProxy marketProxy = service.market.MarketServiceProxy.getInstance();
    final service.market.MarketAccountService acc = service.impl.market.MarketAccountManager.launch(marketDao);
    final service.market.MarketService ms = service.impl.market.MarketServiceManager.launch(order, creditService);
    marketProxy.loadAccountService(acc);
    marketProxy.loadMarketService(ms);
}