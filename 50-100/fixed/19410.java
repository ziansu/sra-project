public javax.swing.JPanel getRolePanel(domain.AbstractUser.Role role) {
    switch (role) {
        case CLIENT :
            return new gui.ClientMainPanel(this);
        case OWNER :
            return ((javax.swing.JPanel) (new gui.MainGUI(role).getContentPane()));
        case ADMIN :
            return null;
        case SUPER_ADMIN :
            return null;
        default :
            java.lang.System.exit(1);
            return null;
    }
}