private void lastItem() {
    if ((searchResult.length) > 1) {
        resultCounter = (searchResult.length) - 1;
        displayResult(searchResult[resultCounter]);
    }
}