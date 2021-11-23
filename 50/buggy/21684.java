public void setRole(java.lang.String roleName) {
    for (com.thoughtworks.entities.util.Role r : com.thoughtworks.entities.util.Role.values()) {
        if (r.getName().equals(roleName))
            this.role = r;
        
    }
}