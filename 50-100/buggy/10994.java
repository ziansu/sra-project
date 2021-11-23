public se.rydberg.handla.model.TextNumber splitNumericAndStingIfFirstLetterIsDigit(java.lang.String word) {
    se.rydberg.handla.model.TextNumber textNumber = new se.rydberg.handla.model.TextNumber();
    if (java.lang.Character.isDigit(word.charAt(0))) {
        return textNumber = splitNumericAndString(word);
    }else {
        textNumber.setText(word);
        textNumber.setNumber("");
        return textNumber;
    }
}