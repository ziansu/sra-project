void updateToolbar(int itemNumber) throws java.lang.IllegalStateException {
    if (itemNumber == (com.davidecirillo.multichoicerecyclerview.MultiChoiceToolbarHelper.ZERO)) {
        showDefaultToolbar();
    }else
        if (itemNumber == (com.davidecirillo.multichoicerecyclerview.MultiChoiceToolbarHelper.ONE)) {
            showMultiChoiceToolbar();
        }
    
    updateToolbarTitle(itemNumber);
}