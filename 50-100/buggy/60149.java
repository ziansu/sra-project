public java.lang.String getAns() {
    java.lang.String answer = "";
    switch (chosenAnswer) {
        case 1 :
            answer = oOne.getText().toString();
        case 2 :
            answer = oTwo.getText().toString();
        case 3 :
            answer = oThree.getText().toString();
    }
    return answer;
}