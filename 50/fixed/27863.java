@java.lang.Override
public void onClick(android.view.View v) {
    if ((objSummaryMatrix) == null)
        objSummaryMatrix = new com.example.swsahu.duplicatecardgame.SummaryMatrix(new java.lang.ref.WeakReference(CurrentGame), CardHeight, CardWidth);
    
    objSummaryMatrix.SetMatrixType(objSummaryMatrix.MOVE_TRACE);
    objSummaryMatrix.CreateMatrix();
}