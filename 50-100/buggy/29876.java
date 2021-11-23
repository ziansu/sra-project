public java.lang.Boolean consultarBaseDeDatos(int producto, java.lang.String talle, java.lang.String cantidad) {
    int tal = 0;
    int cant = java.lang.Integer.parseInt(cantidad);
    switch (talle) {
        case "S" :
            tal = 0;
        case "M" :
            tal = 1;
        case "L" :
            tal = 2;
    }
    if (cant >= (datostock.getUnStock(producto, tal))) {
        return true;
    }else {
        return false;
    }
}