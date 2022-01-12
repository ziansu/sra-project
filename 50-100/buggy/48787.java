@java.lang.Override
protected void configure() {
    bind(new com.google.inject.TypeLiteral<org.apache.james.mailbox.store.search.MessageSearchIndex<org.apache.james.mailbox.cassandra.CassandraId>>() {    }).to(new com.google.inject.TypeLiteral<org.apache.james.mailbox.elasticsearch.events.ElasticSearchListeningMessageSearchIndex<org.apache.james.mailbox.cassandra.CassandraId>>() {    });
    bind(org.apache.james.mailbox.store.extractor.TextExtractor.class).to(org.apache.james.mailbox.tika.extractor.TikaTextExtractor.class);
    bind(new com.google.inject.TypeLiteral<org.apache.james.mailbox.store.search.MessageSearchIndex<org.apache.james.mailbox.cassandra.CassandraId>>() {    }).to(new com.google.inject.TypeLiteral<org.apache.james.mailbox.elasticsearch.events.ElasticSearchListeningMessageSearchIndex<org.apache.james.mailbox.cassandra.CassandraId>>() {    });
}