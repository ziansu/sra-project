@java.lang.Override
public boolean next() throws org.eclipse.datatools.connectivity.oda.OdaException {
    int max = size;
    if ((maxRows) != (-1)) {
        max = java.lang.Math.min(maxRows, size);
    }
    if ((index) < max) {
        row = root.get((++(index)));
    }
    return (index) < max;
}