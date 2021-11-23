public static void main(java.lang.String[] args) {
    se.liu.ida.fanjo813.sebgr273.TDDD78.project.BoardViewer boardViewer = new se.liu.ida.fanjo813.sebgr273.TDDD78.project.BoardViewer(se.liu.ida.fanjo813.sebgr273.TDDD78.project.TestClass.GAME_ENGINE);
    se.liu.ida.fanjo813.sebgr273.TDDD78.project.TestClass.GAME_ENGINE.play();
    for (se.liu.ida.fanjo813.sebgr273.TDDD78.project.Player player : se.liu.ida.fanjo813.sebgr273.TDDD78.project.TestClass.GAME_ENGINE.getPlayers()) {
        java.lang.System.out.println(player);
    }
    java.lang.System.out.println(se.liu.ida.fanjo813.sebgr273.TDDD78.project.TestClass.GAME_ENGINE.getCurPlayer());
}