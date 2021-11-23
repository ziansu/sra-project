public static void main(java.lang.String[] args) {
    try {
        ShortestPathInput g = new ShortestPathInput(java.lang.Integer.parseInt(args[0]));
    } catch (java.lang.IndexOutOfBoundsException e) {
        ShortestPathInput g = new ShortestPathInput(5);
    }
    ShortestPathInput.gooey.setVisible(true);
}