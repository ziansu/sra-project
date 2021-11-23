@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    player.pause();
    java.lang.System.out.println(player.videos.get(0).queryDuration(java.util.concurrent.TimeUnit.MILLISECONDS));
}