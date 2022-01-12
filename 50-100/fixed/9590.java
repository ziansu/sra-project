public java.util.List<pl.sda.hello.names.Name> loadFromFile() {
    java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(0);
    return nameList.stream().map(( s) -> new pl.sda.hello.names.Name(atomicLong.getAndIncrement(), s.trim())).collect(java.util.stream.Collectors.toList());
}