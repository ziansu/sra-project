public static software.reliabletx.spring.ManagedSpringTransaction getInnermostManagedSpringTransaction(org.apache.camel.Exchange exchange) {
    java.lang.Integer count = software.reliabletx.camel.ReliableTxConsumerBuilder.getConsumerBuilderCount(exchange);
    return count != null ? software.reliabletx.camel.ReliableTxConsumerBuilder.getManagedSpringTransaction(exchange, (count > 0 ? count - 1 : 0)) : null;
}