public static java.lang.String getProductPathFile(java.lang.String productId, java.lang.String productName) {
    java.lang.String path = (((((com.tana.utilities.VariableUtility.getCurrentDir()) + (com.tana.utilities.VariableUtility.IMG_PATH_PRODUCTS)) + productId) + "_") + (productName.trim())) + "/";
    com.tana.utilities.VariableUtility.LOGGER.info(("Get product path file : " + path));
    return path;
}