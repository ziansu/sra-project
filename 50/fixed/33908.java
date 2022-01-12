public final void addProducer(org.inaetics.demonstrator.api.producer.Producer p) {
    m_producers.add(p);
    setSampleRate(p, m_productionRate.get());
    info("added producer");
}