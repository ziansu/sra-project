public int extractY(int y) {
    int py = (y + (UserInterface.Accordpanel.YP)) + 60;
    if (curAcc.isSixakk()) {
        py -= 110;
        py /= 50;
    }else {
        py -= 15 + 50;
        py /= 50;
    }
    java.lang.System.out.println(py);
    return py;
}