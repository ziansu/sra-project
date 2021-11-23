@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.System.out.println("show distance matrices");
    if ((parent) == null) {
        java.lang.System.err.println("Not displaying any alignment currently!");
        return ;
    }
    showMatrix(parent.getDisTable1(), "Internal distances for Structure 1");
    showMatrix(parent.getDisTable2(), "Internal distances for Structure 2");
}