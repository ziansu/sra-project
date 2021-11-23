@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    scale.setMaximum((((int) (player.getEndTime())) / 1000));
    int perspectiveValue = ((scale.getMaximum()) - (scale.getSelection())) + (scale.getMinimum());
    java.lang.System.out.println(perspectiveValue);
    player.seek((perspectiveValue * 1000));
}