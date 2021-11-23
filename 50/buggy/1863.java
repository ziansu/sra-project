public java.util.Set<de.unileipzig.bis.rbs.testApp.model.Role> findDescendants() {
    java.util.Set<de.unileipzig.bis.rbs.testApp.model.Role> descendants = new java.util.HashSet<>();
    descendants.add(this);
    findDescendants(descendants);
    return descendants;
}