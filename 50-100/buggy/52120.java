public void setInteractionMode(int interactionMode) {
    switch (interactionMode) {
        case com.agsw.FabricView.FabricView.DRAW_MODE :
            mCommend = new com.agsw.FabricView.DrawableCommend.CPathCommend(createNewPaint(), startPoint, endPoint);
            break;
        case com.agsw.FabricView.FabricView.DRAW_RECTANGLE :
            mCommend = new com.agsw.FabricView.DrawableCommend.CRectangleCommend(createNewPaint(), startPoint, endPoint);
            break;
        case com.agsw.FabricView.FabricView.DRAW_STRAIGHT_LINE :
            mCommend = new com.agsw.FabricView.DrawableCommend.CLineCommend(createNewPaint(), startPoint, endPoint);
            break;
        case com.agsw.FabricView.FabricView.SELECT_MODE :
        case com.agsw.FabricView.FabricView.ROTATE_MODE :
        case com.agsw.FabricView.FabricView.LOCKED_MODE :
            break;
    }
}