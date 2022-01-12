public double deriveDouble01(double neutralIndication) {
    if ((!(gmjonker.math.NaType.isValue(value))) || (!(gmjonker.math.NaType.isValue(confidence))))
        return gmjonker.math.NaType.NA;
    
    return neutralIndication + (((value) - neutralIndication) * (confidence));
}