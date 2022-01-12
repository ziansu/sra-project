public java.util.Set<de.unileipzig.bis.rbs.testApp.model.Role> findDescendants() {
    java.util.Set<de.unileipzig.bis.rbs.testApp.model.Role> descendants = new java.util.HashSet<>();
    findDescendants(descendants);
    return descendants;
}