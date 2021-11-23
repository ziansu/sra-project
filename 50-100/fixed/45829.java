public void addToDomain(java.lang.String domain_name, java.lang.Object value) {
    java.util.Set<java.lang.Object> values = null;
    if (!(m_domains.containsKey(domain_name))) {
        values = new java.util.HashSet<java.lang.Object>();
    }else {
        values = m_domains.get(domain_name);
    }
    values.add(value);
    m_domains.put(domain_name, values);
}