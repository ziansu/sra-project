@java.lang.Override
public void deleteTextOnPage(int pageNumber) {
    if ((pageNumber < 0) || (pageNumber >= (this.pages.length))) {
        java.lang.System.out.println("Invalid page number.");
        return ;
    }
    this.pages[(pageNumber - 1)].deleteText();
}