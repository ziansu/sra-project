public static void main(java.lang.String[] args) {
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        public void run() {
            try {
                movieDBquiz.QuizDemo window = new movieDBquiz.QuizDemo();
                window.AppDemo.setVisible(true);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    });
}