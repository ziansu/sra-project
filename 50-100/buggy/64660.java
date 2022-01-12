private boolean checkFilter(int id) {
    for (int index = 0; index < 3; index++) {
        if (((image.getImage().size()) - 4) == index) {
            if ((order[(2 - index)]) == id) {
                java.lang.System.out.println("testBestanden");
                green = (green) + 1;
                return true;
            }else {
                java.lang.System.out.println("testNichtBestanden");
                return false;
            }
        }
    }
    return false;
}