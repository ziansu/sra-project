@java.lang.Override
public void onClick(android.view.View v) {
    int sum = 0;
    for (int i = 0; i < (Chart.blockList.size()); i++)
        sum += Chart.blockList.get(i).rowSize;
    
    if ((com.piuucseditor.Pointer.row) != sum) {
        int preRow = com.piuucseditor.Pointer.row;
        com.piuucseditor.Pointer.row = sum;
        com.piuucseditor.Chart.updatePointerView();
        checkTexts(preRow);
    }
}