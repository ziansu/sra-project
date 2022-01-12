@java.lang.Override
public void done() {
    if (((outputter) instanceof com.soniccandle.model.XuggleVideoOutputter) && ((outputTo.length()) < 100)) {
        javax.swing.JOptionPane.showMessageDialog(null, "Ooof - looks like there was a problem, sorry.  Please check that your adio file is 16-bit wav, not 24 or 32, thanks!  Other bitrates coming soon, hopefully.");
        return ;
    }
    javax.swing.JOptionPane.showMessageDialog(null, "Done!");
}