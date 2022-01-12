protected javax.swing.JSpinner makeSpinner(int num, java.lang.String name) {
    javax.swing.JSpinner spinner;
    if (name.startsWith("grid")) {
        spinner = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(num, 8, ((gridWidth) * 16), 1));
    }else {
        spinner = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(num, num, Map.MAP_SIZE, 1));
    }
    spinner.setName(name);
    spinner.addChangeListener(this);
    spinner.addKeyListener(this);
    return spinner;
}