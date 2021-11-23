@java.lang.Override
public boolean isValid(java.lang.Object value) {
    beans.Productos productos = ((beans.Productos) (value));
    java.lang.Integer sumGr = 0;
    for (beans.MaterialProducto materialp : productos.getMaterialProducto())
        sumGr = sumGr + (materialp.getCantidadGr());
    
    if (!(sumGr.equals(productos.getCantidadGr()))) {
        throw new enterpriseapp.hibernate.exception.CrudException(enterpriseapp.Utils.getProperty("ui.formulaViolationErrorOnMath"));
    }
    return true;
}