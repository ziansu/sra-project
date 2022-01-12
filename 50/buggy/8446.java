public static com.tridion.storage.si4t.SearchIndexProcessor getInstance() {
    (com.tridion.storage.si4t.SearchIndexProcessor.instanceNumber)++;
    return com.tridion.storage.si4t.SearchIndexProcessor.SingletonHolder.INSTANCE;
}