@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((ParallelMatrixMultiply.status) == (ParallelMatrixMultiply.STATE_MATRIX_INIT_READY))
        ParallelMatrixMultiply.status = ParallelMatrixMultiply.STATE_READY_TO_START;
    
}