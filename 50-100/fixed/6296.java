public double deriveDouble01(double neutralIndication) {
    if ((!(gmjonker.math.NaType.isValue(value))) || (!(gmjonker.math.NaType.isValue(confidence))))
        return gmjonker.math.NaType.NA;
    
    if ((value) > 0) {
        return neutralIndication + (((value) * (confidence)) * (1 - neutralIndication));
    }else {
        return neutralIndication + (((value) * (confidence)) * neutralIndication);
    }
}