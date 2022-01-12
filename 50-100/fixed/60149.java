public java.lang.String getAns() {
    switch (chosenAnswer) {
        case 1 :
            return oOne.getText().toString();
        case 2 :
            return oTwo.getText().toString();
        case 3 :
            return oThree.getText().toString();
        default :
            return "";
    }
}