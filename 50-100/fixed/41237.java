public void actualizarBaseDeDatos(int num, java.lang.String talle, java.lang.String cant) {
    int cantidad1;
    int cantidad2 = 0;
    int cantidad3 = java.lang.Integer.parseInt(cant);
    if (talle == "S") {
        cantidad2 = 0;
    }else
        if (talle == "M") {
            cantidad2 = 1;
        }else
            if (talle == "L") {
                cantidad2 = 2;
            }
        
    
    cantidad1 = datostock.getUnStock(num, cantidad2);
    cantidad1 = cantidad1 - cantidad3;
    datostock.setStock(num, cantidad2, cantidad1);
}