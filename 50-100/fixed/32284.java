@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (arg instanceof java.lang.String) {
        java.lang.String message = ((java.lang.String) (arg));
        if ("Restore".equals(message.toString())) {
            me.addView(dragSpot);
        }
    }else {
        me.addView(dragSpot);
    }
}