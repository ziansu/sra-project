public static boolean show(java.lang.String prefKey, java.lang.String msg) {
    return org.openstreetmap.josm.tools.DontShowAgainInfo.show(prefKey, new javax.swing.JLabel(msg), true, javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.OK_OPTION);
}