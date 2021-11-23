@org.junit.Test
public void overflowtest() {
    main.OSC to = new main.OSC();
    to.SetFOutTime(1.0);
    boolean over = false;
    for (int i = 0; i < 20000; i++) {
        if ((java.lang.Math.abs(to.triangle((i / 10000.0)))) > 1.0)
            over = true;
        
    }
    assertFalse(over);
}