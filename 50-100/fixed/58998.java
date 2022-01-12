@java.lang.Override
public boolean productCallback(java.lang.String categoryCode, java.lang.String name, java.lang.String description, java.lang.String quantity, java.lang.String price, java.lang.String reorderThreshold, java.lang.String reorderQuantity) {
    try {
        sg.edu.nus.iss.universitystore.model.Product updatedProduct = new sg.edu.nus.iss.universitystore.model.Product(categoryCode, name, description, quantity, price, reorderThreshold, reorderQuantity);
        inventoryManager.updateProduct(updatedProduct);
        arrProduct = inventoryManager.getAllProducts();
        inventoryPanel.setProductTableData(sg.edu.nus.iss.universitystore.utility.TableDataUtils.getFormattedProductListForTable(arrProduct), sg.edu.nus.iss.universitystore.utility.TableDataUtils.getHeadersForProductTable());
        return true;
    } catch (java.lang.Exception e) {
    }
    return false;
}