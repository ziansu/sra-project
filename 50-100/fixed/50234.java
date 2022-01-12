public void roleChanged() {
    updateFlags();
    if (user.getRoleName().equalsIgnoreCase(Role.ENTITY_ADMIN.toString())) {
    }else
        if (user.getRoleName().equalsIgnoreCase(Role.ENTITY_USER.toString())) {
            reloadPractises();
        }else {
            listPractise.clear();
        }
    
}