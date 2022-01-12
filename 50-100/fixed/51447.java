public void mainLoop() {
    while (running) {
        try {
            java.lang.System.out.println(setup);
            if (!(setup))
                setUp();
            else
                game();
            
            if (gameOver)
                end();
            
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            java.lang.System.out.println("That boat does not fit on the board. Try again");
        } catch (java.io.IOException e) {
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}