@java.lang.Override
public java.lang.Object execute(com.hazelcast.transaction.TransactionalTaskContext transactionalTaskContext) {
    com.hazelcast.core.TransactionalMap<java.lang.Integer, java.lang.Integer> txMap = transactionalTaskContext.getMap(map.getName());
    txMap.get(key);
    return null;
}