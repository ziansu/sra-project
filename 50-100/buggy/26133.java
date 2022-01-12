@java.lang.Override
public int columns() {
    if (isMatrix()) {
        if ((shape().length) == 2)
            return size(1);
        
    }
    if (isVector()) {
        if (isColumnVector())
            return 1;
        else
            if ((isRowVector()) && ((org.nd4j.linalg.api.shape.Shape.rank(shapeInformation.asNioInt())) > 1))
                return size(1);
            else
                return size(0);
            
        
    }
    throw new java.lang.IllegalStateException("Unable to get number of of columns for a non 2d matrix");
}