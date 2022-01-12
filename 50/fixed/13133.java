@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((ParallelMatrixMultiply.state) == (ParallelMatrixMultiply.STATE_MATRIX_INIT_READY))
        ParallelMatrixMultiply.state = ParallelMatrixMultiply.STATE_READY_TO_START;
    
}