public java.util.List<com.alkacon.vie.shared.I_EntityAttribute> getAttributes() {
    java.util.List<com.alkacon.vie.shared.I_EntityAttribute> result = new java.util.ArrayList<com.alkacon.vie.shared.I_EntityAttribute>();
    for (java.lang.String name : m_simpleAttributes.keySet()) {
        result.add(getAttribute(name));
    }
    for (java.lang.String name : m_entityAttributes.keySet()) {
        result.add(getAttribute(name));
    }
    return null;
}