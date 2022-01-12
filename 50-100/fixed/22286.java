public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.String s = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(herramientaTesting.GUI.frame, "Ingrese un valor entero positivo que representara el limite con el que se mostrara un warning\n", "Severidad minima para complejidad", javax.swing.JOptionPane.PLAIN_MESSAGE)));
    java.lang.System.out.println(s);
    try {
        int valorIngresado = java.lang.Integer.valueOf(s);
        if (valorIngresado > 0) {
            severidadMinimaComplejidad = valorIngresado;
        }
    } catch (java.lang.NumberFormatException ex) {
        if (s != null) {
            javax.swing.JOptionPane.showMessageDialog(herramientaTesting.GUI.frame, "El valor debe ser un numero entero.", "Error al ingresar severidad", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
}