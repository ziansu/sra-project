private void registerClasses(final com.esotericsoftware.kryo.Kryo kryo) {
    kryo.register(cryptoAllPermissionClass, new com.esotericsoftware.kryo.serializers.JavaSerializer());
    kryo.register(AES.ECB.class, new com.joyent.manta.serialization.BaseBlockCipherSerializer(kryo, AES.ECB.class));
    kryo.register(AES.CBC.class, new com.joyent.manta.serialization.BaseBlockCipherSerializer(kryo, AES.CBC.class));
    kryo.register(AES.GCM.class, new com.joyent.manta.serialization.BaseBlockCipherSerializer(kryo, AES.GCM.class));
}