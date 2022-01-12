private boolean checkFilter(int id) {
    for (int index = 0; index < 3; index++) {
        if (((image.getImage().size()) - 4) == index) {
            if ((order[(2 - index)]) == id) {
                java.lang.System.out.println("testBestanden");
                return true;
            }else {
                java.lang.System.out.println("testNichtBestanden");
                return false;
            }
        }
    }
    return false;
}