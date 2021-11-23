private static void set(int keycode, byte value) {
    byte i = 0;
    while (i < (net.suizinshu.external.Manager_Keyboard.NUM_KEYS)) {
        while ((net.suizinshu.external.Manager_Keyboard.keycodes[i]) != keycode)
            i++;
        
        net.suizinshu.external.Manager_Keyboard.states[i] = value;
    } 
}