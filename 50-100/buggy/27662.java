@java.lang.Override
public void addTextToPage(int pageNumber, java.lang.String textToAdd) {
    if (this.verifyPassword()) {
        if ((pageNumber < 0) || (pageNumber >= (this.pages.length))) {
            java.lang.System.out.println("Invalid page number.");
            return ;
        }
        if ((textToAdd == null) || (textToAdd.equals(""))) {
            java.lang.System.out.println("Invalid text for adding.");
            return ;
        }
        this.pages[(pageNumber - 1)].addText(textToAdd);
    }
}