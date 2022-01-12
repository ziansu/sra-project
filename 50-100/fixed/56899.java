public static void showInterface() {
    org.hicham.View.Patient p = new org.hicham.View.Patient();
    org.hicham.View.Ordonance o = new org.hicham.View.Ordonance();
    org.hicham.View.MenuBar mb = new org.hicham.View.MenuBar();
    org.hicham.View.MainFrame mf = new org.hicham.View.MainFrame(p, o, mb);
    org.hicham.Controller.ControllerPatient cp = new org.hicham.Controller.ControllerPatient(mf, p, o);
    org.hicham.Controller.ControllerOrdonance co = new org.hicham.Controller.ControllerOrdonance(mf, p, o);
    org.hicham.Controller.ControllerMenuBar cmb = new org.hicham.Controller.ControllerMenuBar(mf, mb, p, o);
    mf.setVisible(true);
}