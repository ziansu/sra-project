private void checkValue() throws jjcron.polankam.ms.mff.cuni.cz.FormatException {
    switch (unit.valueType) {
        case ASTERISK :
            break;
        case PERIOD :
            isValueValid(unit.values.get(0));
            if (((maxValue) % (unit.values.get(0))) != 0) {
                throw new jjcron.polankam.ms.mff.cuni.cz.FormatException("GeneralUnit period value is not divisible");
            }
            break;
        case LIST :
            for (java.lang.Integer number : unit.values) {
                isValueValid(number);
            }
            break;
    }
}