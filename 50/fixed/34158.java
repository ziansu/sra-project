private void updatePose() {
    slicerVisualIf.cartPose_StateM = imesStatemachine.curPose;
    slicerVisualIf.datatype = imesStatemachine.currentVisualIFDatatype;
    switch (imesStatemachine.currentVisualIFDatatype) {
        case IMAGESPACE :
            if (imesStatemachine.TransformRecieved) {
                slicerVisualIf.T_IMGBASE_StateM = imesStatemachine.TransformRobotImage;
            }
        case JOINTSPACE :
            slicerVisualIf.jntPose_StateM = imesStatemachine.curJntPose;
        default :
            break;
    }
}