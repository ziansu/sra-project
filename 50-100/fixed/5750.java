private java.lang.String resolveHome(by.training.nc.dev5.entity.Person user) {
    if (user == null) {
        return "path.page.index";
    }
    if (UserRole.CUSTOMER.equals(user.getUserRole())) {
        return "path.page.customer.main";
    }else
        if (UserRole.MANAGER.equals(user.getUserRole())) {
            return "path.page.manager.main";
        }else
            if (UserRole.DEVELOPER.equals(user.getUserRole())) {
                return "path.page.developer.main";
            }else {
                return "path.page.index";
            }
        
    
}