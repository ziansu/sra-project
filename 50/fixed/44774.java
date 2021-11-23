public java.lang.Object testNull() throws accessor_one.SomeException112 {
    java.lang.Object raw = broker.getNameService().resolve("Null");
    accessor_one.ClassOneImplBase base = accessor_one.ClassOneImplBase.narrowCast(raw);
    return base.methodOne(null, 1);
}