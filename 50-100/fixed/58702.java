@java.lang.Override
public void run() {
    try {
        com.osreboot.glsledit.NodeArbitraryFloat node = new com.osreboot.glsledit.NodeArbitraryFloat(Main.camera.getX(), Main.camera.getY(), com.osreboot.glsledit.Node.getUserFloat());
        node.setOnDialogueClick(new com.osreboot.ridhvl.action.HvlAction1<com.osreboot.glsledit.Node>() {
            @java.lang.Override
            public void run(com.osreboot.glsledit.Node node) {
                try {
                    ((com.osreboot.glsledit.NodeArbitraryFloat) (node)).setValue(com.osreboot.glsledit.Node.getUserFloat());
                } catch (java.lang.Exception e) {
                }
            }
        });
    } catch (java.lang.Exception e) {
    }
}