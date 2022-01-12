boolean updateProduct(com.example.app.model.Product p) {
    boolean updated = false;
    try {
        updated = this.gateway.updateProduct(p);
        if (updated) {
            updated = this.products.remove(p);
        }
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(com.example.app.model.Model.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return updated;
}