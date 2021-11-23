public void run() {
    Graphics.MainMenu.MenuWindow menu = new Graphics.MainMenu.MenuWindow(new Driver.Graphics.MainMenu.MenuWindowListener() {
        public void windowClosed() {
            java.lang.System.exit(0);
        }
    });
}