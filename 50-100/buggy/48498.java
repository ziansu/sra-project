public org.eclipse.scanning.api.points.IPosition seek(int location, java.util.Iterator<org.eclipse.scanning.api.points.IPosition> iterator) {
    while (iterator.hasNext()) {
        org.eclipse.scanning.api.points.IPosition pos = iterator.next();
        pos.setStepIndex(stepNumber);
        if ((stepNumber) == location)
            return pos;
        
        stepNumber += java.lang.Math.max(innerSize, 1);
    } 
    return null;
}