private void setCorrectAnswer(java.util.ArrayList<com.revature.aes.beans.Option> optionsList) {
    java.lang.Character correctLetter = line.trim().charAt(((line.length()) - 1));
    for (com.revature.aes.beans.Option option : optionsList) {
        if (option.getOptionText().startsWith(correctLetter.toString())) {
            option.setCorrect(1);
        }else {
            option.setCorrect(0);
        }
    }
}