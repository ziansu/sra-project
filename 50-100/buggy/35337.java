private boolean isValidBugReportData(java.lang.String email, java.lang.String description) {
    if ((email == null) || (email == "")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Email is required.");
        return false;
    }
    if ((description == null) || (description == "")) {
        javax.swing.JOptionPane.showMessageDialog(this, "Description is required.");
        return false;
    }
    return true;
}