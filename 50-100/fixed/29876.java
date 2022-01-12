public java.lang.Boolean consultarBaseDeDatos(int producto, java.lang.String talle, java.lang.String cantidad) {
    int tal = 0;
    int cant = java.lang.Integer.parseInt(cantidad);
    if (talle == "S") {
        tal = 0;
    }else
        if (talle == "M") {
            tal = 1;
        }else
            if (talle == "L") {
                tal = 2;
            }
        
    
    if (cant <= (datostock.getUnStock(producto, tal))) {
        return true;
    }else {
        return false;
    }
}