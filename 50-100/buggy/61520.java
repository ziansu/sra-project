public ar.fiuba.tdd.template.enums.Multiplicity getMultiplicity(int indexOfCharacter) {
    if (indexOfCharacter < (this.originalRegularExpr.length())) {
        return ar.fiuba.tdd.template.enums.Multiplicity.ONE;
    }
    java.lang.String charMultiplicity = this.getStringInPosition(this.originalRegularExpr, (indexOfCharacter + (this.NEXT_POSITION)));
    return ar.fiuba.tdd.template.enums.Multiplicity.getMultiplicityOfChar(charMultiplicity);
}