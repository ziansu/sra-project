public com.badlogic.ashley.core.Family get() {
    java.lang.String hash = com.badlogic.ashley.core.Family.getFamilyHash(all, one, exclude);
    com.badlogic.ashley.core.Family family = com.badlogic.ashley.core.Family.families.get(hash, null);
    if (family == null) {
        family = new com.badlogic.ashley.core.Family(all, one, exclude);
        com.badlogic.ashley.core.Family.families.put(hash, family);
    }
    reset();
    return family;
}