@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    app.setVisible(false);
    app.dispose();
    levelBuilderBoundary.LevelBuilderPreviewApplication p;
    try {
        p = new levelBuilderBoundary.LevelBuilderPreviewApplication();
        p.setVisible(true);
        p.getBackBtn().addActionListener(new levelBuilderControllers.PreviewToLevelBuilderController(app, p));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}