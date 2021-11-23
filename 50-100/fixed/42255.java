@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    dialog.setVisible(false);
    view.GameFrame.getInstance().setLevel(null, null, null);
    for (int i = 0; i < 3; i++)
        view.GameFrame.getInstance().getGameCanvas().addItem(model.ItemSpawner.getRandomItem());
    
    view.GameFrame.getInstance().changeComponent(Comp.GAMECANVAS);
}