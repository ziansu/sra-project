public static void main(java.lang.String[] args) {
    com.alvarpq.GOTF.coreGame.board.BoardHalf half1 = new com.alvarpq.GOTF.coreGame.board.BoardHalf(5, 3, 8);
    com.alvarpq.GOTF.coreGame.board.BoardHalf half2 = new com.alvarpq.GOTF.coreGame.board.BoardHalf(5, 3, 8);
    half1.addUnit(new com.alvarpq.GOTF.coreGame.units.KinfolkBrave(0, 0), half2);
    half2.addUnit(new com.alvarpq.GOTF.coreGame.units.KinfolkBrave(1, 2), half2);
    half1.getUnitAt(0, 0).attack(half1, half2);
    java.lang.System.out.println(com.alvarpq.GOTF.coreGame.board.BoardHalf.isAdjacent(0, 0, 1, 1));
}