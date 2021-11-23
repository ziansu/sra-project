public void removeShow(java.lang.String showName) {
    Show show = new Show(showName, 0, null, null, null);
    if ((showList.search(show)) != null) {
        this.showList.remove(show);
    }else {
        java.lang.System.out.println("This show does not exist in the database.");
    }
}