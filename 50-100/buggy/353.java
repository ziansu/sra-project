private com.march.piceditor.sticker.handler.StickerBaseTouchHandler getTouchHandler(int touchType) {
    com.march.piceditor.sticker.handler.StickerBaseTouchHandler handler = mTouchHandlerMap.get(touchType);
    if (handler == null) {
        switch (touchType) {
            case com.march.piceditor.sticker.handler.StickerBaseTouchHandler.MOVE :
                handler = new com.march.piceditor.sticker.handler.impl.MoveHandler();
                break;
            case com.march.piceditor.sticker.handler.StickerBaseTouchHandler.BOTTOM_RIGHT_CORNER :
                handler = new com.march.piceditor.sticker.handler.impl.BottomRightCornerHandler();
                break;
            case com.march.piceditor.sticker.handler.StickerBaseTouchHandler.TWO_FINGER :
                handler = new com.march.piceditor.sticker.handler.impl.TwoFingersHandler();
                break;
        }
    }
    return handler;
}