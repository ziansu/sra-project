public static void main(java.lang.String[] args) throws java.io.FileNotFoundException, java.io.IOException {
    view.CourierSystem s = new view.CourierSystem(null);
    final javax.swing.JFrame window = new javax.swing.JFrame();
    window.setContentPane(new view.LogInScreen(window));
    window.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(view.Application.class.getResource("/view/courier logo.png")));
    window.setTitle("ACME Delivery Management System");
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
}