@java.lang.Override
public io.netty.util.concurrent.Future<java.lang.Boolean> removeAllAsync(java.util.Collection<?> c) {
    if (c.isEmpty()) {
        return org.redisson.RedissonSet.newSucceededFuture(false);
    }
    java.util.List<java.lang.Object> args = new java.util.ArrayList<java.lang.Object>(((c.size()) + 1));
    args.add(getName());
    args.addAll(c);
    return commandExecutor.writeAsync(getName(), codec, RedisCommands.SREM_SINGLE, args.toArray());
}