private void nextItem() {
    if ((searchResult) != null) {
        if (((searchResult.length) > 1) && ((resultCounter) < ((searchResult.length) - 1))) {
            (resultCounter)++;
            displayResult(searchResult[resultCounter]);
        }
    }
}