public void draw(boolean update) {
    if (update || (!(_animate))) {
        java.lang.System.out.print((((char) (27)) + "[H"));
        if (!(_animate)) {
            java.lang.System.out.print((((char) (27)) + "[2J"));
        }
        super.draw();
    }else {
        java.lang.System.out.print((((char) (27)) + "[2J"));
        carvePassages();
    }
}