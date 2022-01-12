@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    addType("", "", "", "");
    if (((bookList.size()) % 6) == 1) {
        (currentPage)++;
        updateFrame(((starterPage[currentPage]) - 6));
    }
    data.close();
}