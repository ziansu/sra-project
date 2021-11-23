private java.awt.event.WindowAdapter get_exit_handler() {
    java.awt.event.WindowAdapter win_close = new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent w) {
            exit_handler(true);
        }
    };
    return win_close;
}