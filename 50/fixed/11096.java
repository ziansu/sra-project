private void lastItem() {
    if ((searchResult) != null) {
        if ((searchResult.length) > 1) {
            resultCounter = (searchResult.length) - 1;
            displayResult(searchResult[resultCounter]);
        }
    }
}