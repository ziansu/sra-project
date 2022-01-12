public java.lang.String getExec(java.lang.String cmd, java.awt.Color color) {
    java.lang.String result = "";
    if ((diagramController) != null) {
        result = diagramController.execute(cmd, color);
    }else {
        delay();
    }
    if ((delay) != 0) {
        diagram.redraw();
        try {
            java.lang.Thread.sleep(delay);
        } catch (java.lang.InterruptedException e) {
            java.lang.System.err.println(e.getMessage());
        }
    }
    return result;
}