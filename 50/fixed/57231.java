private java.awt.event.WindowAdapter get_exit_handler() {
    return new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent w) {
            exit_handler(true);
        }
    };
}