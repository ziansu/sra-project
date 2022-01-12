public void advOutputDisplay(boolean isContinue) {
    if ((outputSignStr.compareTo("-")) == 0) {
        currentExp = (outputSignStr) + (com.arena.deba.mycalculator.MainActivity.outputStr);
    }else
        currentExp = com.arena.deba.mycalculator.MainActivity.outputStr;
    
    if (isContinue == true) {
        currentExp += currentButton;
    }
    com.arena.deba.mycalculator.MainActivity.advFunc = "";
    advFuncTextView.setText(com.arena.deba.mycalculator.MainActivity.advFunc);
}