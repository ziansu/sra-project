private java.awt.Color checkColor(final int row) {
    switch (row) {
        case 0 :
        case 1 :
            return java.awt.Color.GREEN;
        case 2 :
        case 3 :
            return java.awt.Color.YELLOW;
        case 4 :
        case 5 :
            return java.awt.Color.ORANGE;
        case 6 :
        case 7 :
            return java.awt.Color.RED;
        case 8 :
        default :
            return java.awt.Color.CYAN;
    }
}