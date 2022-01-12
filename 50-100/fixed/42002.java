@java.lang.Override
public void onApplicationEvent(org.springframework.context.ApplicationEvent event) {
    if (event instanceof org.springframework.context.event.ContextRefreshedEvent) {
        java.lang.System.out.println(("Building request for tickers: " + (tickersConfig)));
        for (java.lang.String ticker : tickers) {
            if (!(ticker.trim().isEmpty())) {
                org.springframework.messaging.support.MessageBuilder<java.lang.String> builder = org.springframework.messaging.support.MessageBuilder.withPayload("");
                builder.setHeaderIfAbsent("ticker", ticker.trim());
                channel.send(builder.build());
            }
        }
    }
}