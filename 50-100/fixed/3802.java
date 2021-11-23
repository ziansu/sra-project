private void removeFromListActionPerformed(java.awt.event.ActionEvent evt) {
    int[] itemsSelected = numbersToBeAddedList.getSelectedIndices();
    for (int i = (itemsSelected.length) - 1; i >= 0; i--) {
        java.lang.String[] temp = listModel.getElementAt(i).toString().split(" -> ");
        ownMap.remove(temp[0]);
        listModel.remove(itemsSelected[i]);
    }
    numbersToBeAddedList.setModel(listModel);
    numbersToBeAddedList.updateUI();
}