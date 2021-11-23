public boolean selectedRoles(final solomonj.msg.userapp.jpa.model.User u) {
    this.selectedRoles.clear();
    final java.util.List<solomonj.msg.userapp.jpa.model.Role> roles = u.getRoles();
    for (final solomonj.msg.userapp.jpa.model.Role r : roles) {
        this.selectedRoles.add(r.getId());
    }
    return true;
}