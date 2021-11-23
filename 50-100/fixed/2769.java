@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    input = e.getKeyCode();
    if (!(edu.rcos.pkmnrpi.main.util.KeyMapper.map.containsB(input))) {
        java.lang.System.out.println((("Skipping un known input'" + (input)) + "'"));
        return ;
    }
    inmotion = true;
    listen();
}